package Version_1;

import javax.swing.*;

import Version_1.MyFrame.eHandler;

import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame {

	JButton b1, b2, JButtonDecideAllCameras, JCreateObject, JButtonSaveParam;
	JLabel JLabelVideoBitrate, JLabelVideoLength, JLabelAudioFrequency, JLabelWithAudio, JLabelBitCapacity,
			JLabelResult, JLabelFullResult, JLabelResultCameras, JLabelResultCamerasNumber, l3, l4;
	JTextField JTextFieldVideoBitrate, JTextFieldVideoLength, JTextFieldAudioFrequency, JTextFieldAudioBitCapacity,
			JTextFieldResult, t2;
	JComboBox JComboBoxNumberObject;
	String StringForJComboBox, SelectedObject;
	JCheckBox JCheckBoxAudioFile;
	int ObjectNumberName = 0, j;
	VideoObject[] VideoCamera = new VideoObject[33];
	boolean BolleanCheckEdit = true;
	float i, k, CheckEdit = 0, VideoBitrate, VideoLength, AudioFrequency, BitCapacity, FullResult, AudioResult,
			VideoResult, AllCameraResult = 0;
	String a, b;
	eHandler handler = new eHandler();

	public MyFrame(String s) {

		super(s);
		setLayout(null);

		JLabelVideoBitrate = new JLabel("Введите битрейт видео(кбит/сек)");
		JLabelVideoBitrate.setBounds(10, 10, 250, 25);
		JTextFieldVideoBitrate = new JTextField(10);
		JTextFieldVideoBitrate.setBounds(10, 40, 250, 25);

		JLabelVideoLength = new JLabel("Введите длительность видео(сек)");
		JLabelVideoLength.setBounds(10, 70, 250, 25);
		JTextFieldVideoLength = new JTextField(10);
		JTextFieldVideoLength.setBounds(10, 100, 250, 25);

		JLabelWithAudio = new JLabel("Видео со звуком");
		JLabelWithAudio.setBounds(10, 150, 250, 25);
		JCheckBoxAudioFile = new JCheckBox();
		JCheckBoxAudioFile.setSelected(false);
		JCheckBoxAudioFile.setBounds(10, 170, 25, 25);
		JLabelAudioFrequency = new JLabel("Введите частоту дескритизации(Гц)");
		JLabelAudioFrequency.setBounds(10, 200, 250, 25);
		JTextFieldAudioFrequency = new JTextField(10);
		JTextFieldAudioFrequency.setBounds(10, 230, 250, 25);
		JTextFieldAudioFrequency.setEditable(false);
		JLabelBitCapacity = new JLabel("Введите разрядность регистра");
		JLabelBitCapacity.setBounds(10, 260, 250, 25);
		JTextFieldAudioBitCapacity = new JTextField(10);
		JTextFieldAudioBitCapacity.setBounds(10, 290, 250, 25);
		JTextFieldAudioBitCapacity.setEditable(false);
		JButtonDecideAllCameras = new JButton("Посчитать для всех камер");
		JButtonDecideAllCameras.setBounds(10, 420, 200, 25);
		JLabelResult = new JLabel("Выбранная камера:");
		JLabelResult.setBounds(10, 360, 250, 25);
		JLabelFullResult = new JLabel("_____________");
		JLabelFullResult.setBounds(140, 360, 250, 25);

		JLabelResultCameras = new JLabel("Все созданные камеры:");
		JLabelResultCameras.setBounds(10, 390, 250, 25);
		JLabelResultCamerasNumber = new JLabel("_____________");
		JLabelResultCamerasNumber.setBounds(165, 390, 250, 25);
		JCreateObject = new JButton("Добавить камеру");
		JCreateObject.setBounds(290, 50, 150, 25);
		JComboBoxNumberObject = new JComboBox();
		JComboBoxNumberObject.setBounds(290, 100, 150, 25);
		JButtonSaveParam = new JButton("Посчитать и сохранить параметры для этой камеры");
		JButtonSaveParam.setBounds(10, 330, 340, 25);

		l3 = new JLabel("");
		l4 = new JLabel("");
		t2 = new JTextField(10);

		add(JLabelVideoBitrate);
		add(JTextFieldVideoBitrate);
		add(JLabelVideoLength);
		add(JTextFieldVideoLength);
		add(JCheckBoxAudioFile);
		add(JLabelAudioFrequency);
		add(JLabelWithAudio);
		add(JTextFieldAudioFrequency);
		add(JLabelBitCapacity);
		add(JTextFieldAudioBitCapacity);
		add(JButtonDecideAllCameras);
		add(JLabelResult);
		add(JLabelFullResult);
		add(JCreateObject);
		add(JComboBoxNumberObject);
		add(JButtonSaveParam);
		add(JLabelResultCameras);
		add(JLabelResultCamerasNumber);

		JCheckBoxAudioFile.addActionListener(handler);
		JButtonDecideAllCameras.addActionListener(handler);
		JCreateObject.addActionListener(handler);
		JComboBoxNumberObject.addActionListener(handler);
		JButtonSaveParam.addActionListener(handler);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		ObjectNumberName++;
		StringForJComboBox = String.valueOf(ObjectNumberName);

		VideoCamera[ObjectNumberName] = new VideoObject();

		JComboBoxNumberObject.addItem(StringForJComboBox);

		JTextFieldVideoBitrate.setText(String.valueOf(VideoCamera[ObjectNumberName].ObjectVideoBitrate));

		JTextFieldVideoLength.setText(String.valueOf(VideoCamera[ObjectNumberName].ObjectVideoLength));
		JTextFieldAudioFrequency.setText(String.valueOf(VideoCamera[ObjectNumberName].ObjectAudioFrequency));
		JTextFieldAudioBitCapacity.setText(String.valueOf(VideoCamera[ObjectNumberName].ObjectAudioBitCapacity));

		JTextFieldVideoBitrate.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (JTextFieldVideoBitrate.getText().length() >= 9)
					e.consume();
			}
		});
		JTextFieldVideoLength.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (JTextFieldVideoLength.getText().length() >= 9)
					e.consume();
			}
		});
		JTextFieldAudioFrequency.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (JTextFieldAudioFrequency.getText().length() >= 9)
					e.consume();
			}
		});
		JTextFieldAudioBitCapacity.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (JTextFieldAudioBitCapacity.getText().length() >= 9)
					e.consume();
			}
		});

	}

	public class eHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			try {
				if (e.getSource() == JCreateObject) {
					ObjectNumberName++;
					StringForJComboBox = String.valueOf(ObjectNumberName);

					VideoCamera[ObjectNumberName] = new VideoObject();

					JComboBoxNumberObject.addItem(StringForJComboBox);

					JTextFieldVideoBitrate.setText(String.valueOf(VideoCamera[ObjectNumberName].ObjectVideoBitrate));

					JTextFieldVideoLength.setText(String.valueOf(VideoCamera[ObjectNumberName].ObjectVideoLength));
					JTextFieldAudioFrequency
							.setText(String.valueOf(VideoCamera[ObjectNumberName].ObjectAudioFrequency));
					JTextFieldAudioBitCapacity
							.setText(String.valueOf(VideoCamera[ObjectNumberName].ObjectAudioBitCapacity));
					JComboBoxNumberObject.setSelectedIndex(ObjectNumberName - 1);

				}
			} catch (Exception ep) {
				JOptionPane.showMessageDialog(null, "Модель не создалась");
			}

			try {
				if (e.getSource() == JComboBoxNumberObject) {

					SelectedObject = (String) JComboBoxNumberObject.getSelectedItem();
					JTextFieldVideoBitrate
							.setText(String.valueOf(VideoCamera[Integer.valueOf(SelectedObject)].ObjectVideoBitrate));
					JTextFieldVideoLength
							.setText(String.valueOf(VideoCamera[Integer.valueOf(SelectedObject)].ObjectVideoLength));
					JTextFieldAudioFrequency
							.setText(String.valueOf(VideoCamera[Integer.valueOf(SelectedObject)].ObjectAudioFrequency));
					JTextFieldAudioBitCapacity.setText(
							String.valueOf(VideoCamera[Integer.valueOf(SelectedObject)].ObjectAudioBitCapacity));
					JCheckBoxAudioFile.setSelected(VideoCamera[Integer.valueOf(SelectedObject)].Audio);

					if (VideoCamera[Integer.valueOf(SelectedObject)].ObjectCameraTotal != 0) {
						JLabelFullResult.setText(
								String.valueOf(VideoCamera[Integer.valueOf(SelectedObject)].ObjectCameraTotal) + " Мб");
					} else {
						JLabelFullResult.setText(String.valueOf("_____________"));
					}

					if (!(JCheckBoxAudioFile.isSelected())) {
						JTextFieldAudioFrequency.setEditable(false);
						JTextFieldAudioBitCapacity.setEditable(false);

					} else {
						JTextFieldAudioFrequency.setEditable(true);
						JTextFieldAudioBitCapacity.setEditable(true);
					}

				}
			} catch (Exception ep) {
				JOptionPane.showMessageDialog(null, "модель не выбралась");
			}

			try {
				if (e.getSource() == JButtonSaveParam) {

					SelectedObject = (String) JComboBoxNumberObject.getSelectedItem();

					if ((JTextFieldAudioFrequency.getText().equals(""))
							|| (JTextFieldAudioFrequency.getText().equals(" "))
							|| (JTextFieldAudioFrequency.getText().equals("  "))) {

						JTextFieldAudioFrequency.setText("0");
					}
					if ((JTextFieldAudioBitCapacity.getText().equals(""))
							|| (JTextFieldAudioBitCapacity.getText().equals(" "))
							|| (JTextFieldAudioBitCapacity.getText().equals("  "))) {

						JTextFieldAudioBitCapacity.setText("0");
					}

					if ((JTextFieldVideoBitrate.getText().equals("")) || (JTextFieldVideoBitrate.getText().equals(" "))
							|| (JTextFieldVideoBitrate.getText().equals("  "))) {

						JTextFieldVideoBitrate.setText("0");
					}
					if ((JTextFieldVideoLength.getText().equals("")) || (JTextFieldVideoLength.getText().equals(" "))
							|| (JTextFieldVideoLength.getText().equals("  "))) {

						JTextFieldVideoLength.setText("0");
					}
					VideoCamera[Integer.valueOf(SelectedObject)].ObjectVideoBitrate = Integer
							.parseInt(JTextFieldVideoBitrate.getText());
					VideoCamera[Integer.valueOf(SelectedObject)].ObjectVideoLength = Integer
							.parseInt(JTextFieldVideoLength.getText());
					VideoCamera[Integer.valueOf(SelectedObject)].ObjectAudioFrequency = Integer
							.parseInt(JTextFieldAudioFrequency.getText());
					VideoCamera[Integer.valueOf(SelectedObject)].ObjectAudioBitCapacity = Integer
							.parseInt(JTextFieldAudioBitCapacity.getText());
					VideoCamera[Integer.valueOf(SelectedObject)].Audio = JCheckBoxAudioFile.isSelected();

					if ((JCheckBoxAudioFile.isSelected())) {

						VideoBitrate = Integer.parseInt(JTextFieldVideoBitrate.getText());
						VideoLength = Integer.parseInt(JTextFieldVideoLength.getText());
						AudioFrequency = Integer.parseInt(JTextFieldAudioFrequency.getText());
						BitCapacity = Integer.parseInt(JTextFieldAudioBitCapacity.getText());
						AudioResult = AudioFrequency * VideoLength * BitCapacity / 1024;
						VideoResult = VideoBitrate * VideoLength * 60 / 8192;
						FullResult = AudioResult + VideoResult;

						JLabelFullResult.setText(String.valueOf(FullResult + " Мб"));
					}
					if (!(JCheckBoxAudioFile.isSelected())) {

						VideoBitrate = Integer.parseInt(JTextFieldVideoBitrate.getText());
						VideoLength = Integer.parseInt(JTextFieldVideoLength.getText());
						VideoResult = VideoBitrate * VideoLength * 60 / 8192;
						FullResult = VideoResult;
						JLabelFullResult.setText(String.valueOf(FullResult + " Мб"));
						VideoCamera[Integer.valueOf(SelectedObject)].ObjectCameraTotal = FullResult;
					}
					VideoCamera[Integer.valueOf(SelectedObject)].ObjectCameraTotal = FullResult;

				}
			} catch (Exception ep) {
				JOptionPane.showMessageDialog(null, "Заполните строки числами");
			}

			if (e.getSource() == JCheckBoxAudioFile) {

				if (!(JCheckBoxAudioFile.isSelected())) {
					JTextFieldAudioFrequency.setEditable(false);
					JTextFieldAudioBitCapacity.setEditable(false);

				} else {
					JTextFieldAudioFrequency.setEditable(true);
					JTextFieldAudioBitCapacity.setEditable(true);
				}

			}
			if (e.getSource() == JButtonDecideAllCameras) {
				for (j = 0; j < ObjectNumberName; j++) {
					AllCameraResult = AllCameraResult + VideoCamera[Integer.valueOf(j + 1)].ObjectCameraTotal;

				}
				JLabelResultCamerasNumber.setText(String.valueOf(AllCameraResult + " Мб"));
			}
			AllCameraResult = 0;

		}
	}
}
