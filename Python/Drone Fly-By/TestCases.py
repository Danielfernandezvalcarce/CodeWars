import codewars_test as test
from solution import fly_by
from random import randint

@test.describe("Basic tests")
def test_group():
    @test.it("basic tests")
    def test_case():
        test.assert_equals(fly_by('xxxxxx', '====T'), 'ooooox')
        test.assert_equals(fly_by('xxxxxxxxx', '==T'), 'oooxxxxxx')
        test.assert_equals(fly_by('xxxxxxxxxxxxxxx', '=========T'), 'ooooooooooxxxxx')


@test.describe("Random tests")
def test_group():
    def my_fly_by(lamps, drone): return "o" * min(len(drone), len(lamps)) + lamps[len(drone):]
    
    @test.it("random tests")
    def test_case():
        for _ in range(100):
            lamps = "x" * randint(1, 30)
            drone = "=" * randint(0, len(lamps)) + "T"
            test.assert_equals(fly_by(lamps, drone), my_fly_by(lamps, drone))