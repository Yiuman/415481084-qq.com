package com.github.yiuman.citrus.support.wrapper;

/**
 * 可抛异常的Function
 *
 * @author yiuman
 * @date 2020/4/3
 */
public interface FunctionWrapper<T, R, E extends Exception> {

    /**
     * 应用参数返回返回体
     *
     * @param t 参数
     * @return 返回体
     * @throws E 抛出的异常
     */
    R apply(T t) throws E;
}