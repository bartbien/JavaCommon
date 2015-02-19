package guava;

import java.io.FileReader;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.ListUtils;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;
import com.google.common.io.LineReader;
import com.google.common.primitives.Ints;

/**
 * https://code.google.com/p/guava-libraries/wiki/CollectionUtilitiesExplained#Sets
 * 
 * @author BartBien
 *
 */
public class Guava
{
	public static ImmutableSet<String> getSet()
	{
		Set<String> wordsWithPrimeLength = ImmutableSet.of("one", "two", "three", "six", "seven", "eight");
		Set<String> primes = ImmutableSet.of("two", "three", "five", "seven");

		SetView<String> intersection = Sets.intersection(primes, wordsWithPrimeLength); // contains "two", "three", "seven"
		// I can use intersection as a Set directly, but copying it can be more efficient if I use it a lot.
		return intersection.immutableCopy();
	}
	
	public static void main(String[] args)
	{

		List<Integer> countUp = Ints.asList(1, 2, 3, 4, 5);
		List<Integer> countDown = Lists.reverse(countUp); // {5, 4, 3, 2, 1}

		List<List<Integer>> parts = Lists.partition(countUp, 2); // {{1, 2}, {3, 4}, {5}}
		
		getSet();

	}
}
