
FROM gradle:8.11.1-jdk17-alpine as builder
WORKDIR /build

#gradle file이 변경됐을 때만 새롭게 의존 패키지 다운 받게 함.
COPY build.gradle settings.gradle /build/
RUN  gradle build-x test --parallel --continue > /dev/null 2>&1 || true

# builder image에서 application build
COPY . /build
RUN gradle build -x test --parallel

# APP
From openjdk:17
WORKDIR /APP


# builder image에서 jar만 복사
COPY --from=builder /build/build/libs/jooree-0.0.1-SNAPSHOT.jar .

EXPOSE 8081

# USER [유저명] # ROOT 대신 다른 권한으로 사용한다는 뜻
LABEL authors="joore"
ENTRYPOINT[
    "java",
    "-jar",
    "-Djava.security.egd=file/dev/./urandom",
    "-Dsun.net.inetaddr.ttl=0",
    "jooree-0.0.1-SNAPSHOT.jar"
]