var lib = require('nc');

console.log('lib:', lib);
console.log('nc.core.libfn:', lib.nc.core.libfn(123));

var pr1 = lib.nc.core.new_protorec1(5);
console.log('pr1:', pr1);
console.log('pr1.protofn:', lib.nc.core.protofn(pr1, 7));
