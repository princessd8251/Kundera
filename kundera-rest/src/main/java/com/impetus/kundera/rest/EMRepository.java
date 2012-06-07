/**
 * Copyright 2012 Impetus Infotech.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.impetus.kundera.rest;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;

/**
 * <Prove description of functionality provided by this Type> 
 * @author amresh.singh
 */
public class EMRepository
{
    
    /** The Constant INSTANCE. */
    public static final EMRepository INSTANCE = new EMRepository();
    
    private Map<String, EntityManager> emMap;   
    
    
    /**
     * @return the emMap
     */
    public Map<String, EntityManager> getEmMap()
    {
        return emMap;
    }
    
    /**
     * @param emMap the emMap to set
     */
    public void setEmMap(Map<String, EntityManager> emMap)
    {
        this.emMap = emMap;
    }
    
    public void addEm(String sessionToken, EntityManager em)
    {
        if(emMap == null) {
            emMap = new HashMap<String, EntityManager>();
        }
        emMap.put(sessionToken, em);
    }
    
    

}
