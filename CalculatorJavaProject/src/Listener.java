import java.awt.event.*;

public abstract class Listener implements ActionListener {
	private final IView view;

	public Listener(IView view) {
		this.view = view;
	}

	public abstract Parameters getParameters(IView view);

	public abstract IMathAlgorithm getAlgorithm(Parameters parameters);

	@Override
	public void actionPerformed(ActionEvent evt) {
		try {
			Parameters parameters = getParameters(view);
			IMathAlgorithm algorithm = getAlgorithm(parameters);
			algorithm.run();
			if (algorithm.getStatus() == 0)
				view.setTextC("c = "
						+ Lib.convertNumberToText(algorithm.getResult()));
			else
				view.setTextC(algorithm.getErrorMessage());
		} catch (NumberFormatException e) {
			view.setTextC("Non-numeric data");
		}
	}
}