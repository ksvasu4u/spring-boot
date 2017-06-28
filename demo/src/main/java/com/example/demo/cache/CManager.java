package com.example.demo.cache;

import org.springframework.stereotype.Component;

import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;
@Component
public class CManager implements ICManager {
	private NamedCache m_cache;
	
	public CManager() {
		m_cache = CacheFactory.getCache("demo-local-cache");
		
	}
	
	
    /* (non-Javadoc)
	 * @see com.example.demo.cache.ICacheManager#getCacheEntry(java.lang.String)
	 */
    @Override
	public Object getCacheEntry(String cacheKey)
    {
        NamedCache objCache = getCache();
        Object obj = objCache.get(cacheKey);

        //Log key and value in debug - FrameworkLog.logger.debug("");
        
        return obj;
    }    
    
    /* (non-Javadoc)
	 * @see com.example.demo.cache.ICacheManager#addCacheEntry(java.lang.String, java.lang.Object)
	 */
    @Override
	public void addCacheEntry(String cacheKey, Object obj)
    {
    	NamedCache objCache = getCache();
        objCache.put(cacheKey, obj);

        //Log key and value in debug - FrameworkLog.logger.debug("");
    }
    
    private NamedCache getCache() {
    	return m_cache;
	}
}
