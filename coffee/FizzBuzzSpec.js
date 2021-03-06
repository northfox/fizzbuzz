// Generated by CoffeeScript 1.9.1
(function() {
  var FizzBuzz, sut;

  FizzBuzz = require('./FizzBuzz');

  sut = null;

  describe('FizzBuzz', function() {
    beforeEach(function() {
      return sut = new FizzBuzz;
    });
    it('when 3', function() {
      var actual, expected;
      expected = '3 is Fizz.';
      actual = sut.judgeFizzBuzz(3);
      return expect(actual).toBe(expected);
    });
    it('when -3', function() {
      var actual, expected;
      expected = '-3 is Fizz.';
      actual = sut.judgeFizzBuzz(-3);
      return expect(actual).toBe(expected);
    });
    it('when 0', function() {
      var actual, expected;
      expected = '0 is -.';
      actual = sut.judgeFizzBuzz(0);
      return expect(actual).toBe(expected);
    });
    it('when 5', function() {
      var actual, expected;
      expected = '5 is Buzz.';
      actual = sut.judgeFizzBuzz(5);
      return expect(actual).toBe(expected);
    });
    return it('when 15', function() {
      var actual, expected;
      expected = '15 is FizzBuzz.';
      actual = sut.judgeFizzBuzz(15);
      return expect(actual).toBe(expected);
    });
  });

}).call(this);
