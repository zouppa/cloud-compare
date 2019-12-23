module.exports = async function (context, req) {
    context.log('JavaScript HTTP trigger function processed a request.');

    if (req.query.max) {

        var store = [], i, j, primes = [];

        for (i = 2; i <= req.query.max; ++i) {
            if (!store[i]) {
                primes.push(i);
                for (j = i << 1; j <= req.query.max; j += i) {
                    store[j] = true;
                }
            }
        }

        context.res = {
            // status: 200, /* Defaults to 200 */
            body: primes
        };
    }
    else {
        context.res = {
            status: 400,
            body: "Please pass a name on the query string or in the request body"
        };
    }
};