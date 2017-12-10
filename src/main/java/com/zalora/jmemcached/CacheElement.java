package com.zalora.jmemcached;

import org.jboss.netty.buffer.ChannelBuffer;
import java.io.Serializable;

/**
 * @author Ryan Daum
 */
public interface CacheElement extends Serializable {

    int size();

    int hashCode();

    long getExpire();

    long getFlags();

    ChannelBuffer getData();

    void setData(ChannelBuffer data);

    String getKey();

    long getCasUnique();

    void setCasUnique(long casUnique);

    CacheElement append(LocalCacheElement element);

    CacheElement prepend(LocalCacheElement element);

    LocalCacheElement.IncrDecrResult add(int mod);

}
