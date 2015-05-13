FizzBuzz = require('./FizzBuzz')
sut = null

describe 'FizzBuzz', ->

    beforeEach ->
        sut = new FizzBuzz;

    it 'when 3', ->
        expected = '3 is Fizz.'
        actual = sut.judgeFizzBuzz(3)
        expect(actual).toBe(expected)
    
    it 'when -3', ->
        expected = '-3 is Fizz.';
        actual = sut.judgeFizzBuzz(-3);
        expect(actual).toBe(expected);
    
    it 'when 0', ->
        expected = '0 is -.';
        actual = sut.judgeFizzBuzz(0);
        expect(actual).toBe(expected);
    
    it 'when 5', ->
        expected = '5 is Buzz.';
        actual = sut.judgeFizzBuzz(5);
        expect(actual).toBe(expected);
    
    it 'when 15', ->
        expected = '15 is FizzBuzz.';
        actual = sut.judgeFizzBuzz(15);
        expect(actual).toBe(expected);
