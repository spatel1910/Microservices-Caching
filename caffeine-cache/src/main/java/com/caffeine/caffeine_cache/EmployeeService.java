package com.caffeine.caffeine_cache;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Cacheable(cacheNames = "staticDataCache")
    public String getData(){
        System.out.println("Fetching it from the database, Costly opration");
        return "Sandeep";
    }

    @CachePut(cacheNames = "staticDataCache")
    public String updateData(){
        System.out.println("Updating in database,and cache data will be replaced with new ");
        return "NewData";
    }

    @CacheEvict(cacheNames = "staticDataCache")
    public String clearCache(){
        System.out.println("Cleared cache");
        return "Cache has been cleared";
    }

}
