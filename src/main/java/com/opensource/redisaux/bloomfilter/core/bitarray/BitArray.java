package com.opensource.redisaux.bloomfilter.core.bitarray;

import java.util.List;

public interface BitArray<T> {
    void setBitSize(long bitSize);

    /**
     * 设置单个键，indexs为hash后的位数
     * @param indexs
     * @return
     */
    boolean set(long[] indexs);

    /**
     * 设置多个键，为多个值hash后的位数
     * @param indexs
     * @return
     */
    boolean setBatch(List<long[]> indexs);

    boolean get(long[] indexs);

    List<Boolean> getBatch(List<long[]> indexs);

    long bitSize();

    void reset();

}
