function main(params) {
    
    var store  = [], i, j, primes = [];
    
    for (i = 2; i <= params.max; ++i) 
    {
        if (!store [i]) 
          {
            primes.push(i);
            for (j = i << 1; j <= params.max; j += i) 
            {
                store[j] = true;
            }
        }
    }
	return { payload: primes};
}