/*******************************************************************************
 * Copyright 2014 Miami-Dade County
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.sharegov.timemachine;


import org.springframework.beans.BeansException;  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.ApplicationContextAware;  
  
/** 
 * This class provides an application-wide access to the 
 * Spring ApplicationContext! The ApplicationContext is 
 * injected in a static method of the class "AppContext". 
 * 
 * Use AppContext.getApplicationContext() to get access 
 * to all Spring Beans. 
 * 
 * @author Siegfried Bolz 
 */  
public class ApplicationContextProvider implements ApplicationContextAware {  
  
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {  
        // Wiring the ApplicationContext into a static method  
        AppContext.setApplicationContext(ctx);  
    }  
} 


