var FizzBuzz = FizzBuzz || {};

FizzBuzz.printFizzBuzz = function(target) {
    console.log(this.judgeFizzBuzz(target));
};

FizzBuzz.judgeFizzBuzz = function(target) {
    if (target === 0) {
        return target + ' is -.';
    } else if (target % 3 === 0 && target % 5 === 0) {
        return target + ' is FizzBuzz.';
    } else if (target % 3 === 0) {
        return target + ' is Fizz.';
    } else if(target % 5 === 0) {
        return target + ' is Buzz.';
    } else {
        return target + ' is -.';
    }
}

module.exports = FizzBuzz;
