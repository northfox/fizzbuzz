// Generated by CoffeeScript 1.9.1
(function() {
  var FizzBuzz;

  FizzBuzz = (function() {
    function FizzBuzz() {}

    FizzBuzz.prototype.printFizzBuzz = function(target) {
      return console.log(this.judgeFizzBuzz(target));
    };

    FizzBuzz.prototype.judgeFizzBuzz = function(target) {
      if (target === 0) {
        return target + " is -.";
      } else if (target % 3 === 0 && target % 5 === 0) {
        return target + " is FizzBuzz.";
      } else if (target % 3 === 0) {
        return target + " is Fizz.";
      } else if (target % 5 === 0) {
        return target + " is Buzz.";
      } else {
        return target + " is -.";
      }
    };

    return FizzBuzz;

  })();

  module.exports = FizzBuzz;

}).call(this);