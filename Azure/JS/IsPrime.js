module.exports = async function (context, req) {
    context.log('JavaScript HTTP trigger function processed a request.');

    if (req.query.number) {
        var number = eq.query.number;
        
        if(number > 1){
      for (var i = 2;  i < number; i++) {
  
        if (number % i !== 0 ) {
          return { payload: true};
        }
  
        else if (number === i * i) {
          return { payload: false}
        }
  
        else {
          return { payload: false};
        }
      }
    }
    else {
      return { payload: false};
    }
        context.res = {
            // status: 200, /* Defaults to 200 */
            body: "Hello " + (req.query.name || req.body.name)
        };
    }
    else {
        context.res = {
            status: 400,
            body: "Please pass a name on the query string or in the request body"
        };
    }
};