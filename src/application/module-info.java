// Java Program to create a popup and display
// it on a parent frame
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class pop extends JFrame implements ActionListener {
	// popup
	Popup p;

	// constructor
	pop()
	{
		// create a frame
		JFrame f = new JFrame("pop");
		// create a label
		JLabel l = new JLabel("This is a popup");
		f.setSize(400, 400);
		PopupFactory pf = new PopupFactory();
		// create a panel
		JPanel p2 = new JPanel();
		// set Background of panel
		p2.setBackground(Color.black);
		p2.add(l);
		// create a popup
		p = pf.getPopup(f, p2, 180, 100);
		// create a button
		JButton b = new JButton("click");
		// add action listener
		b.addActionListener(this);
		// create a panel
		JPanel p1 = new JPanel();
		p1.add(b);
		f.add(p1);
		f.show();
	}

	// if the button is pressed
	public void actionPerformed(ActionEvent e)
	{
		p.show();
	}
	// main class
	public static void main(String args[])
	{
		pop p = new pop();
	}
}

let number = parseInt(document.querySelector('.number'));
let oldVal = 1;
let newVal = oldVal++;
const plus = document.querySelector('.plus_minus'),
minus = document.querySelector('.minus_plus');

let number_el = document.querySelector('.number');

plus.addEventListener('click', () => {
let val = parseInt(number_el.innerText);
number_el.innerText = ++val;
});

minus.addEventListener('click', () => {
let val = parseInt(number_el.innerText);
number_el.innerText = --val;
});
<button class="plus_minus">+</button>
<span class="number">1</span>
<button class="minus_plus">-</button>
