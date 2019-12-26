module.exports = async function (context, req) {
  let prime = true;
  for (let i = 2; i <= Math.sqrt(req.query.number); i++) {
    if (req.query.number % i == 0) {
      prime = false;
      break;
    }
  }

  context.res = {
    // status: 200, /* Defaults to 200 */
    body: prime
  };
}
