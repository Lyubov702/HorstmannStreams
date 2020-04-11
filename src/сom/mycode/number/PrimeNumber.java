package сom.mycode.number;

import java.math.BigInteger;
import java.util.stream.Stream;

//16. Find 500 prime numbers with 50 decimal digits,
// using a parallel stream of BigInteger and the BigInter.isProbablePrime method.
public class PrimeNumber {
    public static void main(String[] args) {
        BigInteger num = new BigInteger("10000000000000000000000000000000000000000000000000");
        Stream<BigInteger> primeNumber = Stream.iterate(num, i -> i.add(BigInteger.ONE)).parallel()
                .filter(bigInteger -> bigInteger.isProbablePrime(1))
                .limit(500);
        System.out.println("Prime number: ");
        primeNumber.forEach(System.out::println);
    }
}
