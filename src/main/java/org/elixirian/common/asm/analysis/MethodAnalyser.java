/**
 * 
 */
package org.elixirian.common.asm.analysis;

import java.lang.reflect.Method;
import java.util.Map;

/**
 * @author Lee, SeongHyun (Kevin)
 * @version 0.0.1 (2010-06-22)
 */
public interface MethodAnalyser
{
	<T> Map<Method, String[]> findMethodsWithParameterNames(Class<T> theClass);
}