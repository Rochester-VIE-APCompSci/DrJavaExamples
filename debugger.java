/*
 * Copyright (c) 2017 IBM Corporation
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 *  How to use this file: 
 *  1) Enable Debugger
 *  2) Set breakpoint(s) below
 *  3) Set up the following variable watches: i, test, myString, str
 */

// Outputs a comma-separted list of integers. e.g., 0, 1, 2, 3, 4, ...
class debugger {
  public static void main (String [] args) {
    String test = "";
    int max = 10;
    System.out.println("Hello World");
    
    for (int i = 0; i < max; i++) {
      // Put a breakpoint on the following line to experiment with debugger controls
      String str = concatenateAndPrint(i, max);
      test += str;
    }
    
    System.out.println("Final string contents: " + test);
  }
  
  public static String concatenateAndPrint(int i, int max) {
    // Put a breakpoint on the following line to see the call stack and flow within the method
    System.out.println("Current index: " + i);
    String myString = i + "";
    if (i < max-1) {
      myString += ", ";
    }
    return myString;
  }
}