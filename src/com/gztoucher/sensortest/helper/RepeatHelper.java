package com.gztoucher.sensortest.helper;

/**
 * �ж��Ƿ��ظ��Ķ�������ֹ��ʱ������ظ�����Ҳ����˵����Ч�Ĳ���
 *
 * @author ����[QQ:1023694760]
 * @version 2015/4/3
 *          Created by IntelliJ IDEA 14.1
 */
public class RepeatHelper {
    private static final long DEFAULT_TIME_MILLIS = 800;//����
    private static long lastTimeMillis = 0L;

    public static boolean isFastDoubleAction(long maxTimeMillis) {
        long currentTimeMillis = System.currentTimeMillis();
        long diff = currentTimeMillis - lastTimeMillis;
        if (diff < maxTimeMillis) {
            return true;
        } else {
            lastTimeMillis = currentTimeMillis;
            return false;
        }
    }

    public static boolean isFastDoubleAction() {
        //���ʱ���Ӿ�����Ŀ�������������
        return isFastDoubleAction(DEFAULT_TIME_MILLIS);
    }

}
