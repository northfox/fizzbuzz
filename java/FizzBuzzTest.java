package jp.co.mycom.myapp.fizzbuzz;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FizzBuzzTest {

  private FizzBuzz sut;
  
  @Rule
  public ExpectedException exception = ExpectedException.none();

  @Before
  public void before() {
    sut = new FizzBuzz();
  }

  @Test
  public void saidInで0から15まで正しくFizzBuzz判定できる() {
    // expect
    String expected = "0: -\n" +
        "1: -\n" +
        "2: -\n" +
        "3: Fizz\n" +
        "4: -\n" +
        "5: Buzz\n" +
        "6: Fizz\n" +
        "7: -\n" +
        "8: -\n" +
        "9: Fizz\n" +
        "10: Buzz\n" +
        "11: -\n" +
        "12: Fizz\n" +
        "13: -\n" +
        "14: -\n" +
        "15: FizzBuzz";

    // exercise
    String actual = sut.saidIn(0, 15);

    // verify
    assertThat(actual, is(expected));
  }

  @Test
  public void saidInで1から0を指定すると例外が発生する() {
    // expect
    exception.expect(RuntimeException.class);
    exception.expectMessage(
        "Last parameter need to be bigger than previous parameter.");
    
    // exercise
    // verify
    sut.saidIn(1, 0);
  }
  
  @Test
  public void saidInで0から0を指定しても例外が発生しない() {
    // expect
    String expected = "0: -";
    
    // exercise
    String actual = sut.saidIn(0, 0);

    // verify
    assertThat(actual, is(expected));
  }

  @Test
  public void saidで10_9_13_12_15のFizzBuzz判定ができる() {
    // expect
    String expected = 
        "10: Buzz\n" +
        "9: Fizz\n" +
        "13: -\n" +
        "12: Fizz\n" +
        "15: FizzBuzz";

    // exercise
    String actual = sut.said(10, 9, 13, 12, 15);

    // verify
    assertThat(actual, is(expected));
  }

  @Test
  public void saidで空のFizzBuzz判定で例外が発生する() {
    // expect
    exception.expect(RuntimeException.class);
    exception.expectMessage("Need to set numbers.");

    // exercise
    sut.said();
  }

  @Test
  public void judgeFizzOrBuzzでー3のFizzBuzz判定ができる() {
    // expect
    String expected = FizzBuzz.lineType.FIZZ.toString();

    // exercise
    String actual = sut.judgeFizzOrBuzz(-3).toString();

    // verify
    assertThat(actual, is(expected));
  }

  @Test
  public void judgeFizzOrBuzzでー1のFizzBuzz判定ができる() {
    // expect
    String expected = FizzBuzz.lineType.NONE.toString();

    // exercise
    String actual = sut.judgeFizzOrBuzz(-1).toString();

    // verify
    assertThat(actual, is(expected));
  }

  @Test
  public void judgeFizzOrBuzzで0のFizzBuzz判定ができる() {
    // expect
    String expected = FizzBuzz.lineType.NONE.toString();

    // exercise
    String actual = sut.judgeFizzOrBuzz(0).toString();

    // verify
    assertThat(actual, is(expected));
  }

  @Test
  public void judgeFizzOrBuzzで3のFizzBuzz判定ができる() {
    // expect
    String expected = FizzBuzz.lineType.FIZZ.toString();

    // exercise
    String actual = sut.judgeFizzOrBuzz(3).toString();

    // verify
    assertThat(actual, is(expected));
  }

  @Test
  public void judgeFizzOrBuzzで5のFizzBuzz判定ができる() {
    // expect
    String expected = FizzBuzz.lineType.BUZZ.toString();

    // exercise
    String actual = sut.judgeFizzOrBuzz(5).toString();

    // verify
    assertThat(actual, is(expected));
  }

  @Test
  public void judgeFizzOrBuzzで15のFizzBuzz判定ができる() {
    // expect
    String expected = FizzBuzz.lineType.FIZZ_BUZZ.toString();

    // exercise
    String actual = sut.judgeFizzOrBuzz(15).toString();

    // verify
    assertThat(actual, is(expected));
  }

  @Test
  public void generateFizzBuzzLineで3をFizzBuzz判定したメッセージが生成できる() {
    // expect
    String expected = "3: Fizz\n";
    
    // exercise
    String actual = sut.generateFizzBuzzLine(3).toString();
    
    // verify
    assertThat(actual, is(expected));
  }

  @Test
  public void generateFizzBuzzLineで5をFizzBuzz判定したメッセージが生成できる() {
    // expect
    String expected = "5: Buzz\n";
    
    // exercise
    String actual = sut.generateFizzBuzzLine(5).toString();
    
    // verify
    assertThat(actual, is(expected));
  }

  @Test
  public void generateFizzBuzzLineで15をFizzBuzz判定したメッセージが生成できる() {
    // expect
    String expected = "15: FizzBuzz\n";
    
    // exercise
    String actual = sut.generateFizzBuzzLine(15).toString();
    
    // verify
    assertThat(actual, is(expected));
  }

  @Test
  public void generateFizzBuzzLineで0をFizzBuzz判定したメッセージが生成できる() {
    // expect
    String expected = "0: -\n";
    
    // exercise
    String actual = sut.generateFizzBuzzLine(0).toString();
    
    // verify
    assertThat(actual, is(expected));
  }
}
