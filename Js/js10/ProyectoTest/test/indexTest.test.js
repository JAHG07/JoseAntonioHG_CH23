//const indexTest = require("../calculadora");
import { indexTest } from "../calculadora"
test('test suma', ()=>{
    const r = indexTest.suma(1,2);
    expect(r).toBe(5);
})
test.todo("test resta");
test.todo("test multi");
test.todo("test divide");