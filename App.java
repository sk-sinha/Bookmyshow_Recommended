/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;

import java.net.MalformedURLException;

public class App {
  public void getGreeting() throws InterruptedException, MalformedURLException {

    // Amazonsearch amazonsearch = new Amazonsearch(); // Initialize your test class
    // BookMyShowLink bookMyShowLink = new BookMyShowLink();
   // LinkedInPost linkedInPost = new LinkedInPost();
   BMSRecommended bmsRecommended = new BMSRecommended();

    // TODO: call your test case functions one after other here

    // amazonsearch.testCase01();
    // bookMyShowLink.bookMyShowLink1();
   // linkedInPost.LinkedInPost1();
    bmsRecommended.bmslink();

    // Amazonsearch amazonsearch = new Amazonsearch();

    // amazonsearch.testCase01();
    // END Tests
    // amazonsearch.endTest();

    // tests.endTest(); // End your test by clearning connections and closing
    // browser
  }

  public static void main(String[] args) throws InterruptedException, MalformedURLException {
    new App().getGreeting();
  }
}
