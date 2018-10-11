
package CollectionsActivity;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BankAccountList {

	public static void main(String[] args) {
		Set<SavingAccount> set = new TreeSet<SavingAccount>();
		set.add(new SavingAccount(101,"Ramesh", true, 10000));
		set.add(new SavingAccount(103,"Dhruba", true, 30000));
		set.add(new SavingAccount(108,"Tarun", false, 50000));
		set.add(new SavingAccount(101,"Ramesh", true, 10000));
		set.add(new SavingAccount(105,"Harsh", false, 20000));
	
		Iterator<SavingAccount> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
