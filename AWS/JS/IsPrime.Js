exports.handler = async (event) => {
    var number = event.number;
    if (number > 1) {
        for (var i = 2; i < number; i++) {

            if (number % i !== 0) {
                return { payload: true };
            }

            else if (number === i * i) {
                return { payload: false }
            }

            else {
                return { payload: false };
            }
        }
    }
    else {
        return { payload: false };
    }
};