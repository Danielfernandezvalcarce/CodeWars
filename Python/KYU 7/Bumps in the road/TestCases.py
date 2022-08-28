import codewars_test as test
from solution import bumps

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        test.assert_equals(bumps("n"), "Woohoo!")
        test.assert_equals(bumps("__nn_nnnn__n_n___n____nn__nnn"), "Woohoo!")
        test.assert_equals(bumps("nnn_n__n_n___nnnnn___n__nnn__"), "Woohoo!")
        test.assert_equals(bumps("_nnnnnnn_n__n______nn__nn_nnn"), "Car Dead")
        test.assert_equals(bumps("______n___n_"), "Woohoo!")
        test.assert_equals(bumps("nnnnnnnnnnnnnnnnnnnnn"), "Car Dead")

@test.describe("Random tests")
def _():
    import random
    
    def my_bumps(road):
        return "Woohoo!" if road.count("n") <= 15 else "Car Dead"
    
    for i in range(100):
        testcase = "".join(random.choice(["n", "_"]) for j in range(random.randint(1, 36)))
        @test.it(f"Testing for bumps({repr(testcase)})")   
        def _():
            test.assert_equals(bumps(testcase), my_bumps(testcase))