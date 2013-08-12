/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jruyi.cmd;

/**
 * Service for printing command manual.
 */
public interface IManual {

	/**
	 * Prints the manual of the specified {@code command}.
	 * 
	 * @param command
	 *            manual of which to be printed
	 * @throws Exception
	 *             if any error
	 */
	public void help(String command) throws Exception;
}
