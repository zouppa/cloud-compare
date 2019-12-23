exports.handler = async (event) => {
    
    var store  = [], i, j, primes = [];
    
    for (i = 2; i <= event.max; ++i) 
    {
        if (!store [i]) 
          {
            primes.push(i);
            for (j = i << 1; j <= event.max; j += i) 
            {
                store[j] = true;
            }
        }
    }
    
    const response = {
        statusCode: 200,
        body: JSON.stringify({payload:primes}),
    };
    return response;
};