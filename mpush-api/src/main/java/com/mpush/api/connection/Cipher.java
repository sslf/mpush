package com.mpush.api.connection;

/**
 * Created by ohun on 2015/12/28.
 *
 * @author ohun@live.cn
 */
public interface Cipher {

    byte[] decrypt(byte[] data);

    byte[] encrypt(byte[] data);

}
