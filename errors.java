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

class errors {
  public static void main (String [] args) {
    String test = null;
    int max = 10;
    System.out.println("Hello World");
    
    int i = 0;
    for (i = 0; i < max; i++); {
      System.out.println("String length: " + test.length());
      test += concatenateAndPrint(i, max);
    }
    System.out.println("Final string contents: " + test);
    
    i = 0;
    while (i < 16) {
      System.out.print("Na ");
    }
    System.out.println("Batman!");
    
    boolean b = false;
    if (b = true) {
      System.out.println("b is true!");
    }  
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