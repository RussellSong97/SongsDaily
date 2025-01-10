/**
 * @file common used function is collected. / 흔히 쓰는 함수들 모음.
 * @author  Russell Song / 송주리
 * @copyright 2024-present Russell Song in Republic of Korea
 *
 * @references :
 *      - Viewer.js : https://fengyuanchen.github.io/viewerjs
 */

/**
 * @function 요소에 class 넣기
 * @param   {Element}   el      - class 넣을 요소
 * @param   {String}    cVal    - 요소에 넣을 class 문자열
 * */
const fn_addClass = (el, cVal) => {

    if(!el || !cVal) return;

}

/**
 * @function    배열에 들어가는 인수의 개수
 * @param       {Object} obj - 배열 혹은 문자열
 * @return      {Number}     - 개수
 * */
const fn_cntObjArgs = (obj) => {
    let result = 0;

    return result;
}

/**
 * @function    빈문자인지 아닌지
 * @param       {Object}    obj - 들어간 개수...?
 * @return      {Bolean}        - 빈 문자열인지 아닌지 확인하기
 * */
const fn_strBoolean = (obj) => {
    return false;
}

/**
 *  @function 정수인지 아닌지 확인하는 함수
 *  @param      {*}         isVal    - 정수인지 확인 당할 데이터
 *  @returns    {Boolean}
 * */
const fn_isNumber = (isVal) => {
    return typeof isVal === 'number' && isNaN(isVal);
}