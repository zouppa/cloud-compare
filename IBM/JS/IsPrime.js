function main(params) {
  let prime = true;
  for (let i = 2; i <= Math.sqrt(params.number); i++) {
    if (params.number % i == 0) {
      prime = false;
      break;
    }
  }
    return { payload: prime };
  }