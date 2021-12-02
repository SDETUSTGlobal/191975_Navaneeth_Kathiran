// conf.js
exports.config = {
    framework: 'jasmine',
    specs: ['./login-spec.js'],
    directConnect: true,
  /*  onPrepare() { 
        require('ts-node').register({ 
        project: require('path').join(__dirname, './tsconfig.json') // Relative path of tsconfig.json file 
      });
    }
    */
}