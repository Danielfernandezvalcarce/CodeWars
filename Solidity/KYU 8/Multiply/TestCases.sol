const { loadFixture } = require("@nomicfoundation/hardhat-network-helpers");

const { assert } = require("chai");

describe('DummyToken', () => {
  async function deployDummyTokenFixture() {
    const DummyToken = await ethers.getContractFactory("DummyToken");
    const dummy = await DummyToken.deploy();
    return { dummy };
  }
  
  it('should have a function "multiply" that correctly multiplies two integers (Sample Test)', async function () {
    const { dummy } = await loadFixture(deployDummyTokenFixture);
    assert.strictEqual(+await dummy.multiply(3, 5), 15);
  });
  
  it('should have a function "multiply" that correctly multiplies two integers (Fixed Tests)', async function () {
    const { dummy } = await loadFixture(deployDummyTokenFixture);
    assert.strictEqual(+await dummy.multiply(2, 4), 8);
    assert.strictEqual(+await dummy.multiply(4, 2), 8);
    assert.strictEqual(+await dummy.multiply(7, 5), 35);
    assert.strictEqual(+await dummy.multiply(7, 7), 49);
    assert.strictEqual(+await dummy.multiply(17, 0), 0);
    assert.strictEqual(+await dummy.multiply(0, -8), 0, 'Your function should also work for negative integers');
    assert.strictEqual(+await dummy.multiply(-8, 9), -72, 'Your function should also work for negative integers');
    assert.strictEqual(+await dummy.multiply(-9, -8), 72, 'Your function should also work for negative integers');
    assert.strictEqual(+await dummy.multiply(9, -9), -81, 'Your function should also work for negative integers');
    assert.strictEqual(+await dummy.multiply(12, 12), 144);
  });
  
  it('should have a function "multiply" that correctly multiplies two integers (Random Tests)', async function () {
    const { dummy } = await loadFixture(deployDummyTokenFixture);
    var a, b, actual, expected;
    for (let i = 0; i < 100; i++) {
      a = ~~(101 * Math.random());
      b = ~~(101 * Math.random());
      expected = a * b;
      assert.strictEqual(+await dummy.multiply(a, b), expected);
      assert.strictEqual(+await dummy.multiply(b, a), expected);
    }
  });
});