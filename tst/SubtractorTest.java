import unittest
from src.Adder import Adder

class AdderTest(unittest.TestCase):
    def test_add(self):
        a = Adder()
        self.assertEqual(a.add(2, 3), 5)
        self.assertEqual(a.add(-1, 1), 0)
        self.assertEqual(a.add(0, 0), 0)

if __name__ == "__main__":
    unittest.main()
