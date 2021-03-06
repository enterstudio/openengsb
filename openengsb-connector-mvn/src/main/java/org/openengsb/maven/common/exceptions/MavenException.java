/**

   Copyright 2009 OpenEngSB Division, Vienna University of Technology

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
   
 */

package org.openengsb.maven.common.exceptions;

/**
 * This exception describes every exception thrown from Maven during different
 * phases. To compare the phases, a string supports the user in error message.
 * 
 */
public class MavenException extends Exception {

    /**
     * Serial version UID
     */
    private static final long serialVersionUID = 3323599287593676392L;

    public MavenException() {
    }

    public MavenException(String message, Throwable cause) {
        super(message, cause);
    }

    public MavenException(String message) {
        super(message);
    }

    public MavenException(Throwable cause) {
        super(cause);
    }
}
