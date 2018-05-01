package Final;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Joe Pett A simple fantasy football tracker application.
 */
public class FinalDriver {

	public static void main(String[] args) {
		queue picks = new queue(10); // lowered to 10 picks to save time
		ArrayList<String> nameArray = new ArrayList<String>();
		int numOfRounds = 2; // lowered to 2 round to save time
		int pickNum = 1;
		final int ZERO = 0;
		boolean loop1 = true;
		String player1;
		String athleteName1;
		String athleteTeam1;
		String athletePosition1;
		boolean loop2 = true;
		String player2;
		String athleteName2;
		String athleteTeam2;
		String athletePosition2;
		boolean loop3 = true;
		String player3;
		String athleteName3;
		String athleteTeam3;
		String athletePosition3;

		player1 = JOptionPane.showInputDialog("Enter Player1's name");
		String upperPlayer1 = player1.toUpperCase();
		owner owner1 = new owner(pickNum++, upperPlayer1);
		player2 = JOptionPane.showInputDialog("Enter Player2's name");
		String upperPlayer2 = player2.toUpperCase();
		owner owner2 = new owner(pickNum++, upperPlayer2);
		player3 = JOptionPane.showInputDialog("Enter Player3's name");
		String upperPlayer3 = player3.toUpperCase();
		owner owner3 = new owner(pickNum++, upperPlayer3);

		while (numOfRounds > ZERO) {
			numOfRounds--;

			// PLAYER1
			// ------------------------------------------------------------------------------------------------------------------------------------------------------
			athleteName1 = JOptionPane.showInputDialog("Player1, Enter the name of your pick");
			String upperName1 = athleteName1.toUpperCase();

			while (loop1) {
				if (!nameArray.contains(upperName1)) {
					nameArray.add(upperName1);
					athleteTeam1 = JOptionPane.showInputDialog("Player1, Enter the team of your pick");
					String upperTeam1 = athleteTeam1.toUpperCase();
					athletePosition1 = JOptionPane.showInputDialog("Player1, Enter the position of your pick");
					String upperPosition1 = athletePosition1.toUpperCase();
					owner playerA = new athlete(owner1 + upperName1, upperTeam1, upperPosition1);
					picks.enqueue(playerA);
					break;

				} else if (nameArray.contains(upperName1)) {
					JOptionPane.showMessageDialog(null, "Athlete already exists, please try again");
					athleteName1 = JOptionPane.showInputDialog("Player1, Enter the name of your pick");
					String upperName = athleteName1.toUpperCase();
					nameArray.add(upperName);
					athleteTeam1 = JOptionPane.showInputDialog("Player1, Enter the team of your pick");
					String upperTeam1 = athleteTeam1.toUpperCase();
					athletePosition1 = JOptionPane.showInputDialog("Player1, Enter the position of your pick");
					String upperPosition1 = athletePosition1.toUpperCase();
					owner playerA = new athlete(owner1 + upperName, upperTeam1, upperPosition1);
					picks.enqueue(playerA);
					break;

				}
			}

			// PLAYER2
			// ------------------------------------------------------------------------------------------------------------------------------------------------------
			athleteName2 = JOptionPane.showInputDialog("Player2, Enter the name of your pick");
			String upperName2 = athleteName2.toUpperCase();

			while (loop2) {
				if (!nameArray.contains(upperName2)) {
					nameArray.add(upperName2);
					athleteTeam2 = JOptionPane.showInputDialog("Player2, Enter the team of your pick");
					String upperTeam2 = athleteTeam2.toUpperCase();
					athletePosition2 = JOptionPane.showInputDialog("Player2, Enter the position of your pick");
					String upperPosition2 = athletePosition2.toUpperCase();
					owner playerB = new athlete(owner2 + upperName2, upperTeam2, upperPosition2);
					picks.enqueue(playerB);
					break;

				} else if (nameArray.contains(upperName2)) {
					JOptionPane.showMessageDialog(null, "Athlete already exists, please try again");
					athleteName2 = JOptionPane.showInputDialog("Player2, Enter the name of your pick");
					String upperName = athleteName2.toUpperCase();
					nameArray.add(upperName);
					athleteTeam2 = JOptionPane.showInputDialog("Player2, Enter the team of your pick");
					String upperTeam2 = athleteTeam2.toUpperCase();
					athletePosition2 = JOptionPane.showInputDialog("Player2, Enter the position of your pick");
					String upperPosition2 = athletePosition2.toUpperCase();
					owner playerB = new athlete(owner2 + upperName, upperTeam2, upperPosition2);
					picks.enqueue(playerB);
					break;

				}
			}

			// PLAYER3
			// ------------------------------------------------------------------------------------------------------------------------------------------------------
			athleteName3 = JOptionPane.showInputDialog("Player3, Enter the name of your pick");
			String upperName3 = athleteName3.toUpperCase();

			while (loop3) {
				if (!nameArray.contains(upperName3)) {
					nameArray.add(upperName3);
					athleteTeam3 = JOptionPane.showInputDialog("Player3, Enter the team of your pick");
					String upperTeam3 = athleteTeam3.toUpperCase();
					athletePosition3 = JOptionPane.showInputDialog("Player3, Enter the position of your pick");
					String upperPosition3 = athletePosition3.toUpperCase();
					owner playerC = new athlete(owner3 + upperName3, upperTeam3, upperPosition3);
					picks.enqueue(playerC);
					break;

				} else if (nameArray.contains(upperName3)) {
					JOptionPane.showMessageDialog(null, "Athlete already exists, please try again");
					athleteName3 = JOptionPane.showInputDialog("Player3, Enter the name of your pick");
					String upperName = athleteName3.toUpperCase();
					nameArray.add(upperName);
					athleteTeam3 = JOptionPane.showInputDialog("Player3, Enter the team of your pick");
					String upperTeam3 = athleteTeam3.toUpperCase();
					athletePosition3 = JOptionPane.showInputDialog("Player3, Enter the position of your pick");
					String upperPosition3 = athletePosition3.toUpperCase();
					owner playerC = new athlete(owner3 + upperName, upperTeam3, upperPosition3);
					picks.enqueue(playerC);
					break;

				}
			}
			picks.print();
		}
		JOptionPane.showMessageDialog(null, "End of Draft!");
		picks.print();
		System.exit(0);
	}
}
