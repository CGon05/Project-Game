
class Unit {

	// create unit variables
	private String unitname;
	private String unitclass;
	private int level;
	private int exp;
	private int hp;
	private int maxhp;
	private int strength;
	private int speed;
	private int defense;
	private int resistance;
	private int luck;
	private int accuracy;
	private int evasion;
	private int critRate;
	private int movement;

	// Mastery variables
	private char sword_Mastery;
	private int sword_Mxp = 0;
	private int max_sword_Mxp = 100;

	private char axe_Mastery;
	private int axe_Mxp = 0;
	private int max_axe_Mxp = 100;

	private char spear_Mastery;
	private int spear_Mxp = 0;
	private int max_spear_Mxp = 100;

	private char magic_Mastery;
	private int magic_Mxp = 0;
	private int max_magic_Mxp = 100;

	private static char[] Mastery_levels = { 'E', 'D', 'C', 'B', 'A' };

	// -----------------------------------------------------
	// get & set methods for unitname
	public String getunitname() {

		System.out.println(unitname);
		return unitname;

	}

	public void setunitname(String newunitname) {

		unitname = newunitname;

	}

	// -----------------------------------------------------
	// get & set methods for unitclass
	public String getunitclass() {

		System.out.println(unitclass);
		return unitclass;

	}

	public void setlevel(String newunitclass) {

		unitclass = newunitclass;

	}

	// -----------------------------------------------------
	// get & set methods for Level
	public int getlevel() {

		System.out.println(level);
		return level;

	}

	public void setlevel(int newlevel) {

		level = newlevel;

	}

	// -----------------------------------------------------
	// get & set methods for exp
	public int getexp() {

		System.out.println(exp);
		return exp;

	}

	public void setexp(int newexp) {

		exp = newexp;

	}

	// -----------------------------------------------------
	// get & set methods for hp
	public int gethp() {

		System.out.println(hp);
		return hp;

	}

	public void sethp(int newhp) {

		hp = newhp;

	}

	// -----------------------------------------------------
	// get & set methods for maxhp
	public int getmaxhp() {

		System.out.println(maxhp);
		return maxhp;

	}

	public void setmaxhp(int newmaxhp) {

		maxhp = newmaxhp;

	}

	// -----------------------------------------------------
	// get & set methods for strength
	public int getstrength() {

		System.out.println(strength);
		return strength;

	}

	public void setstrength(int newstrength) {

		strength = newstrength;

	}

	// -----------------------------------------------------
	// get & set methods for speed
	public int getspeed() {

		System.out.println(speed);
		return speed;

	}

	public void setspeed(int newspeed) {

		speed = newspeed;

	}

	// -----------------------------------------------------
	// get & set methods for defense
	public int getdefense() {

		System.out.println(defense);
		return defense;

	}

	public void setdefense(int newdefense) {

		defense = newdefense;

	}

	// -----------------------------------------------------
	// get & set methods for resistance
	public int getresistance() {

		System.out.println(resistance);
		return resistance;

	}

	public void setresistance(int newresistance) {

		resistance = newresistance;

	}

	// -----------------------------------------------------
	// get & set methods for luck
	public int getluck() {

		System.out.println(luck);
		return luck;

	}

	public void setluck(int newluck) {

		luck = newluck;

	}

	// -----------------------------------------------------
	// get & set methods for accuracy
	public int getaccuracy() {

		System.out.println(accuracy);
		return accuracy;

	}

	public void setaccuracy(int newaccuracy) {

		accuracy = newaccuracy;

	}

	// -----------------------------------------------------
	// get & set methods for evasion
	public int getevasion() {

		System.out.println(evasion);
		return evasion;

	}

	public void setevasion(int newevasion) {

		evasion = newevasion;

	}

	// -----------------------------------------------------
	// get & set methods for critRate
	public int getcritRate() {

		System.out.println(critRate);
		return critRate;

	}

	public void critRate(int newcritRate) {

		critRate = newcritRate;

	}

	// -----------------------------------------------------
	// get & set methods for movement
	public int getmovement() {

		System.out.println(movement);
		return movement;

	}

	public void setmovement(int newmovement) {

		movement = newmovement;

	}

	// -----------------------------------------------------
	// get & set methods for sword_Mastery
	public char getsword_Mastery() {

		System.out.println(sword_Mastery);
		return sword_Mastery;

	}

	public void setsword_Mastery(int j) {

		sword_Mastery = Mastery_levels[j];

	}

	// -----------------------------------------------------
	// get & set methods for axe_Mastery
	public char getaxe_Mastery() {

		System.out.println(axe_Mastery);
		return axe_Mastery;

	}

	public void setaxe_Mastery(int j) {

		axe_Mastery = Mastery_levels[j];

	}

	// -----------------------------------------------------
	// get & set methods for spear_Mastery
	public char getspear_Mastery() {

		System.out.println(spear_Mastery);
		return spear_Mastery;

	}

	public void setspear_Mastery(int j) {

		spear_Mastery = Mastery_levels[j];

	}

	// -----------------------------------------------------
	// get & set methods for magic_Mastery
	public char getmagic_Mastery() {

		System.out.println(magic_Mastery);
		return magic_Mastery;

	}

	public void setmagic_Mastery(int j) {

		magic_Mastery = Mastery_levels[j];

	}

	// -----------------------------------------------------
	// Unit constructor
	public Unit() {

	}

}

//---------------------------------------
// New class FarmerJoe
class FarmerJoe extends Unit {

	FarmerJoe() {

		setunitname("Farmer Joe");
		setlevel(1);
		setexp(0);
		setmaxhp(18);
		sethp(getmaxhp());
		setstrength(15);
		setspeed(10);
		setdefense(10);
		setresistance(5);
		setluck(10);
		setaccuracy(10);
		setevasion(10);
		setmovement(3);
		setsword_Mastery(1);
		setaxe_Mastery(1);
		setspear_Mastery(2);
		setmagic_Mastery(0);

	}

}

//---------------------------------------
//New class NathanielBrown
class NathanielBrown extends Unit {

}
