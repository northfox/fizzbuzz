var FizzBuzz = require('./FizzBuzz');
var sut;

describe('FizzBuzz', function() {

    beforeEach(function() {
        sut = FizzBuzz;
    });

    it('when 3', function() {
        var expected = '3 is Fizz.';
        var actual = sut.judgeFizzBuzz(3);
        expect(actual).toBe(expected);
    });
    
    it('when -3', function() {
        var expected = '-3 is Fizz.';
        var actual = sut.judgeFizzBuzz(-3);
        expect(actual).toBe(expected);
    });
    
    it('when 0', function() {
        var expected = '0 is -.';
        var actual = sut.judgeFizzBuzz(0);
        expect(actual).toBe(expected);
    });
    
    it('when 5', function() {
        var expected = '5 is Buzz.';
        var actual = sut.judgeFizzBuzz(5);
        expect(actual).toBe(expected);
    });
    
    it('when 15', function() {
        var expected = '15 is FizzBuzz.';
        var actual = sut.judgeFizzBuzz(15);
        expect(actual).toBe(expected);
    });
});
