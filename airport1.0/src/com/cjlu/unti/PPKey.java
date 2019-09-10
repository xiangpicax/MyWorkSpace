package com.cjlu.unti;

import java.security.Key;

import java.security.KeyPair;

import java.security.KeyPairGenerator;

import java.security.interfaces.RSAPrivateKey;

import java.security.interfaces.RSAPublicKey;

import java.util.HashMap;

import java.util.Map;

import sun.misc.BASE64Decoder;

import sun.misc.BASE64Encoder;

@SuppressWarnings("unused")

public class PPKey {

    public static final String KEY_ALGORITHM = "RSA";

    public static final String SIGNATURE_ALGORITHM = "MD5withRSA";

    private static final String PUBLIC_KEY = "RSAPublicKey";

    private static final String PRIVATE_KEY = "RSAPrivateKey";



    public static Map<String,Object> getPPKey(){

        Map<String, Object> keyMap;
        Map<String, Object> ppKey = new HashMap<>();

        try {

            keyMap = initKey();

            String publicKey =  getPublicKey(keyMap);
            ppKey.put("publicKey",publicKey);
//            System.out.println(publicKey);
            String privateKey =  getPrivateKey(keyMap);

//            System.out.println(privateKey);
            ppKey.put("privateKey",privateKey);
            return ppKey;
        } catch (Exception e) {

            e.printStackTrace();

            return ppKey;
        }

    }

    public static String getPublicKey(Map<String, Object> keyMap) throws Exception {

        Key key = (Key) keyMap.get(PUBLIC_KEY);

        byte[] publicKey = key.getEncoded();

        return encryptBASE64(key.getEncoded());

    }

    public static String getPrivateKey(Map<String, Object> keyMap) throws Exception {

        Key key = (Key) keyMap.get(PRIVATE_KEY);

        byte[] privateKey =key.getEncoded();

        return encryptBASE64(key.getEncoded());

    }



    public static byte[] decryptBASE64(String key) throws Exception {

        return (new BASE64Decoder()).decodeBuffer(key);

    }



    public static String encryptBASE64(byte[] key) throws Exception {

        return (new BASE64Encoder()).encodeBuffer(key);

    }



    public static Map<String, Object> initKey() throws Exception {

        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance(KEY_ALGORITHM);

        keyPairGen.initialize(1024);

        KeyPair keyPair = keyPairGen.generateKeyPair();

        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();

        RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();

        Map<String, Object> keyMap = new HashMap<String, Object>(2);

        keyMap.put(PUBLIC_KEY, publicKey);

        keyMap.put(PRIVATE_KEY, privateKey);

        return keyMap;

    }

}