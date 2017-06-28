package com.example.demo.cache;

public interface ICManager {

	Object getCacheEntry(String cacheKey);

	void addCacheEntry(String cacheKey, Object obj);

}