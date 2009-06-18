import jpwr.rt.*;
import jpwr.jop.*;
import jpwr.jopc.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.awt.font.*;
import javax.swing.*;
import java.awt.event.*;

public class Demo_proc_temperaturecontrol extends JopFrame implements JopUtilityIfc {
  JPanel contentPane;
  BorderLayout borderLayout1 = new BorderLayout();
  public LocalPanel localPanel = new LocalPanel();
  boolean scrollbar = false;
  Dimension size;
  pwr_sliderbackground3	pwr_sliderbackground33;
  pwr_slider3	pwr_slider34;
  pwr_logga	pwr_logga18;
  JopSmallbutton	jopSmallbutton21;
  JopSmallbutton	jopSmallbutton22;
  pwr_buttoninfo	pwr_buttoninfo23;
  help_button	help_button25;
  pwr_valueinputmediumrd	pwr_valueinputmediumrd26;
  JopSmallbutton	jopSmallbutton27;
  JopSmallbutton	jopSmallbutton28;
  JopTrend	jopTrend29;
  mcomp_abb_acs800fanaggr	mcomp_abb_acs800fanaggr32;
  mcomp_abb_acs800fanaggr	mcomp_abb_acs800fanaggr41;
  bcomp_mvalve	bcomp_mvalve50;
  bcomp_pressuresensor	bcomp_pressuresensor52;
  pwr_pidcontroller	pwr_pidcontroller67;
  bcomp_pressuresensor	bcomp_pressuresensor69;
  pwr_pidcontroller	pwr_pidcontroller71;
  pwr_valuemedium	pwr_valuemedium72;
  pwr_valuemedium	pwr_valuemedium73;
  bcomp_pressureswitch	bcomp_pressureswitch74;
  bcomp_pressureswitch	bcomp_pressureswitch76;
  pwr_valuemedium	pwr_valuemedium78;
  bcomp_tempsensor	bcomp_tempsensor81;
  pwr_pidcontroller	pwr_pidcontroller95;
  pwr_burner	pwr_burner97;
  pwr_burner	pwr_burner98;
  pwr_burner	pwr_burner99;
  pwr_burner	pwr_burner100;
  pwr_burner	pwr_burner101;
  pwr_burner	pwr_burner102;
  pwr_valve	pwr_valve103;
  pwr_valve	pwr_valve104;
  pwr_valve	pwr_valve105;
  pwr_valve	pwr_valve106;
  pwr_valve	pwr_valve107;
  pwr_valve	pwr_valve108;
  pwr_valve	pwr_valve109;
  pwr_valve	pwr_valve110;
  pwr_valve	pwr_valve111;
  pwr_valve	pwr_valve112;
  pwr_valve	pwr_valve113;
  pwr_valve	pwr_valve114;
  JopTrend	jopTrend115;
  pwr_valuemedium	pwr_valuemedium116;
  pwr_indroundlarge	pwr_indroundlarge117;
  public Demo_proc_temperaturecontrol( JopSession session, String instance, boolean scrollbar) {
    super( session, instance);
    this.scrollbar = scrollbar;
    geInit();
  }
  public Demo_proc_temperaturecontrol( JopSession session, String instance, boolean scrollbar, boolean noinit) {
    super( session, instance);
    this.scrollbar = scrollbar;
    if ( !noinit)
      geInit();
  }
  public void geInit() {
    JopSpider.setSystemName( "pwrdemo");
    engine.setAnimationScanTime( 500);
    engine.setScanTime( 1000);
    size = new Dimension( 611, 553);
    Dimension dsize = new Dimension(localPanel.original_width,localPanel.original_height);
    this.addComponentListener(new AspectRatioListener(this,size));
    contentPane = (JPanel) this.getContentPane();
    contentPane.setLayout(borderLayout1);
    if ( scrollbar)
      contentPane.add( new JScrollPane(localPanel), BorderLayout.CENTER);
    else
      contentPane.add(localPanel, BorderLayout.CENTER);
    contentPane.setOpaque(true);
    localPanel.setLayout( new RatioLayout()); // scaletest
    localPanel.setOpaque(true);
    this.setSize(size);
    if ( engine.isInstance())
      setTitle( engine.getInstance());
    else
      this.setTitle("Demo_proc_temperaturecontrol");
    pwr_sliderbackground33 = new pwr_sliderbackground3(session);
    pwr_sliderbackground33.setBounds(new Rectangle(234,72,52,62));
    pwr_sliderbackground33.setFillColor(32);
    localPanel.add(pwr_sliderbackground33, new Proportion(pwr_sliderbackground33.getBounds(), dsize));
    pwr_slider34 = new pwr_slider3(session);
    pwr_slider34.setBounds(new Rectangle(235,85,53,12));
    localPanel.add(pwr_slider34, new Proportion(pwr_slider34.getBounds(), dsize));
    pwr_logga18 = new pwr_logga(session);
    pwr_logga18.setBounds(new Rectangle(522,6,71,49));
    localPanel.add(pwr_logga18, new Proportion(pwr_logga18.getBounds(), dsize));
    jopSmallbutton21 = new JopSmallbutton(session);
    jopSmallbutton21.setBounds(new Rectangle(367,9,70,18));
    jopSmallbutton21.setFillColor(31);
    jopSmallbutton21.setBorderColor(0);
    jopSmallbutton21.setTextColor(0);
    localPanel.add(jopSmallbutton21, new Proportion(jopSmallbutton21.getBounds(), dsize));
    jopSmallbutton22 = new JopSmallbutton(session);
    jopSmallbutton22.setBounds(new Rectangle(442,9,70,18));
    jopSmallbutton22.setFillColor(31);
    jopSmallbutton22.setBorderColor(34);
    jopSmallbutton22.setTextColor(37);
    localPanel.add(jopSmallbutton22, new Proportion(jopSmallbutton22.getBounds(), dsize));
    pwr_buttoninfo23 = new pwr_buttoninfo(session);
    pwr_buttoninfo23.setBounds(new Rectangle(331,9,24,25));
    localPanel.add(pwr_buttoninfo23, new Proportion(pwr_buttoninfo23.getBounds(), dsize));
    help_button25 = new help_button(session);
    help_button25.setBounds(new Rectangle(305,9,25,25));
    localPanel.add(help_button25, new Proportion(help_button25.getBounds(), dsize));
    pwr_valueinputmediumrd26 = new pwr_valueinputmediumrd(session);
    pwr_valueinputmediumrd26.setBounds(new Rectangle(517,110,61,26));
    pwr_valueinputmediumrd26.setShadow(1);
    localPanel.add(pwr_valueinputmediumrd26, new Proportion(pwr_valueinputmediumrd26.getBounds(), dsize));
    jopSmallbutton27 = new JopSmallbutton(session);
    jopSmallbutton27.setBounds(new Rectangle(311,71,70,18));
    jopSmallbutton27.setFillColor(31);
    localPanel.add(jopSmallbutton27, new Proportion(jopSmallbutton27.getBounds(), dsize));
    jopSmallbutton28 = new JopSmallbutton(session);
    jopSmallbutton28.setBounds(new Rectangle(386,71,70,18));
    jopSmallbutton28.setFillColor(31);
    localPanel.add(jopSmallbutton28, new Proportion(jopSmallbutton28.getBounds(), dsize));
    jopTrend29 = new JopTrend( session);
    jopTrend29.setBounds(new Rectangle(20,72,239,61));
    jopTrend29.setFillColor(39);
    jopTrend29.setBorderColor(36);
    jopTrend29.setBorderColorTrend1(144);
    jopTrend29.setBorderColorTrend2(294);
    jopTrend29.setFillColorTrend1(138);
    jopTrend29.setFillColorTrend2(288);
    jopTrend29.setDrawFill(1);
    jopTrend29.setDrawBorder(1);
    jopTrend29.setTrendBorderWidth(1);
    jopTrend29.setLineWidth(1);
    jopTrend29.setMinValue1(0F);
    jopTrend29.setMaxValue1(500F);
    jopTrend29.setMinValue2(0F);
    jopTrend29.setMaxValue2(500F);
    jopTrend29.setNoOfPoints(100);
    jopTrend29.setHorizontalLines(4);
    jopTrend29.setVerticalLines(4);
    jopTrend29.setRotate(0);
    localPanel.add(jopTrend29, new Proportion(jopTrend29.getBounds(), dsize));
    mcomp_abb_acs800fanaggr32 = new mcomp_abb_acs800fanaggr(session);
    mcomp_abb_acs800fanaggr32.setBounds(new Rectangle(52,409,56,38));
    mcomp_abb_acs800fanaggr32.setFillColor(213);
    mcomp_abb_acs800fanaggr32.setRotate(-360);
    mcomp_abb_acs800fanaggr32.setShadow(1);
    localPanel.add(mcomp_abb_acs800fanaggr32, new Proportion(mcomp_abb_acs800fanaggr32.getBounds(), dsize));
    mcomp_abb_acs800fanaggr41 = new mcomp_abb_acs800fanaggr(session);
    mcomp_abb_acs800fanaggr41.setBounds(new Rectangle(52,287,56,38));
    mcomp_abb_acs800fanaggr41.setFillColor(134);
    mcomp_abb_acs800fanaggr41.setShadow(1);
    localPanel.add(mcomp_abb_acs800fanaggr41, new Proportion(mcomp_abb_acs800fanaggr41.getBounds(), dsize));
    bcomp_mvalve50 = new bcomp_mvalve(session);
    bcomp_mvalve50.setBounds(new Rectangle(191,279,56,38));
    bcomp_mvalve50.setFillColor(134);
    bcomp_mvalve50.setShadow(1);
    localPanel.add(bcomp_mvalve50, new Proportion(bcomp_mvalve50.getBounds(), dsize));
    bcomp_pressuresensor52 = new bcomp_pressuresensor(session);
    bcomp_pressuresensor52.setBounds(new Rectangle(156,252,21,21));
    bcomp_pressuresensor52.setFillColor(134);
    bcomp_pressuresensor52.setShadow(1);
    localPanel.add(bcomp_pressuresensor52, new Proportion(bcomp_pressuresensor52.getBounds(), dsize));
    pwr_pidcontroller67 = new pwr_pidcontroller(session);
    pwr_pidcontroller67.setBounds(new Rectangle(107,207,38,38));
    pwr_pidcontroller67.setShadow(1);
    localPanel.add(pwr_pidcontroller67, new Proportion(pwr_pidcontroller67.getBounds(), dsize));
    bcomp_pressuresensor69 = new bcomp_pressuresensor(session);
    bcomp_pressuresensor69.setBounds(new Rectangle(156,374,21,21));
    bcomp_pressuresensor69.setFillColor(214);
    bcomp_pressuresensor69.setShadow(1);
    localPanel.add(bcomp_pressuresensor69, new Proportion(bcomp_pressuresensor69.getBounds(), dsize));
    pwr_pidcontroller71 = new pwr_pidcontroller(session);
    pwr_pidcontroller71.setBounds(new Rectangle(106,329,38,38));
    pwr_pidcontroller71.setShadow(1);
    localPanel.add(pwr_pidcontroller71, new Proportion(pwr_pidcontroller71.getBounds(), dsize));
    pwr_valuemedium72 = new pwr_valuemedium(session);
    pwr_valuemedium72.setBounds(new Rectangle(183,252,56,21));
    localPanel.add(pwr_valuemedium72, new Proportion(pwr_valuemedium72.getBounds(), dsize));
    pwr_valuemedium73 = new pwr_valuemedium(session);
    pwr_valuemedium73.setBounds(new Rectangle(183,375,56,21));
    localPanel.add(pwr_valuemedium73, new Proportion(pwr_valuemedium73.getBounds(), dsize));
    bcomp_pressureswitch74 = new bcomp_pressureswitch(session);
    bcomp_pressureswitch74.setBounds(new Rectangle(122,375,21,21));
    bcomp_pressureswitch74.setFillColor(244);
    bcomp_pressureswitch74.setShadow(1);
    localPanel.add(bcomp_pressureswitch74, new Proportion(bcomp_pressureswitch74.getBounds(), dsize));
    bcomp_pressureswitch76 = new bcomp_pressureswitch(session);
    bcomp_pressureswitch76.setBounds(new Rectangle(122,252,21,21));
    bcomp_pressureswitch76.setFillColor(134);
    bcomp_pressureswitch76.setShadow(1);
    localPanel.add(bcomp_pressureswitch76, new Proportion(bcomp_pressureswitch76.getBounds(), dsize));
    pwr_valuemedium78 = new pwr_valuemedium(session);
    pwr_valuemedium78.setBounds(new Rectangle(520,145,56,21));
    localPanel.add(pwr_valuemedium78, new Proportion(pwr_valuemedium78.getBounds(), dsize));
    bcomp_tempsensor81 = new bcomp_tempsensor(session);
    bcomp_tempsensor81.setBounds(new Rectangle(580,145,21,21));
    bcomp_tempsensor81.setShadow(1);
    localPanel.add(bcomp_tempsensor81, new Proportion(bcomp_tempsensor81.getBounds(), dsize));
    pwr_pidcontroller95 = new pwr_pidcontroller(session);
    pwr_pidcontroller95.setBounds(new Rectangle(407,114,38,38));
    pwr_pidcontroller95.setShadow(1);
    localPanel.add(pwr_pidcontroller95, new Proportion(pwr_pidcontroller95.getBounds(), dsize));
    pwr_burner97 = new pwr_burner(session);
    pwr_burner97.setBounds(new Rectangle(366,261,21,62));
    pwr_burner97.setRotate(-270);
    pwr_burner97.setShadow(1);
    localPanel.add(pwr_burner97, new Proportion(pwr_burner97.getBounds(), dsize));
    pwr_burner98 = new pwr_burner(session);
    pwr_burner98.setBounds(new Rectangle(444,261,21,62));
    pwr_burner98.setRotate(-270);
    pwr_burner98.setShadow(1);
    localPanel.add(pwr_burner98, new Proportion(pwr_burner98.getBounds(), dsize));
    pwr_burner99 = new pwr_burner(session);
    pwr_burner99.setBounds(new Rectangle(523,261,21,62));
    pwr_burner99.setRotate(-270);
    pwr_burner99.setShadow(1);
    localPanel.add(pwr_burner99, new Proportion(pwr_burner99.getBounds(), dsize));
    pwr_burner100 = new pwr_burner(session);
    pwr_burner100.setBounds(new Rectangle(409,322,21,62));
    pwr_burner100.setRotate(-450);
    pwr_burner100.setShadow(1);
    localPanel.add(pwr_burner100, new Proportion(pwr_burner100.getBounds(), dsize));
    pwr_burner101 = new pwr_burner(session);
    pwr_burner101.setBounds(new Rectangle(488,322,21,62));
    pwr_burner101.setRotate(-450);
    pwr_burner101.setShadow(1);
    localPanel.add(pwr_burner101, new Proportion(pwr_burner101.getBounds(), dsize));
    pwr_burner102 = new pwr_burner(session);
    pwr_burner102.setBounds(new Rectangle(566,322,21,62));
    pwr_burner102.setRotate(-450);
    pwr_burner102.setShadow(1);
    localPanel.add(pwr_burner102, new Proportion(pwr_burner102.getBounds(), dsize));
    pwr_valve103 = new pwr_valve(session);
    pwr_valve103.setBounds(new Rectangle(359,235,17,21));
    pwr_valve103.setFillColor(134);
    pwr_valve103.setRotate(-90);
    pwr_valve103.setShadow(1);
    localPanel.add(pwr_valve103, new Proportion(pwr_valve103.getBounds(), dsize));
    pwr_valve104 = new pwr_valve(session);
    pwr_valve104.setBounds(new Rectangle(377,221,17,21));
    pwr_valve104.setFillColor(214);
    pwr_valve104.setRotate(-90);
    pwr_valve104.setShadow(1);
    localPanel.add(pwr_valve104, new Proportion(pwr_valve104.getBounds(), dsize));
    pwr_valve105 = new pwr_valve(session);
    pwr_valve105.setBounds(new Rectangle(438,235,17,21));
    pwr_valve105.setFillColor(134);
    pwr_valve105.setRotate(-90);
    pwr_valve105.setShadow(1);
    localPanel.add(pwr_valve105, new Proportion(pwr_valve105.getBounds(), dsize));
    pwr_valve106 = new pwr_valve(session);
    pwr_valve106.setBounds(new Rectangle(456,221,17,21));
    pwr_valve106.setFillColor(214);
    pwr_valve106.setRotate(-90);
    pwr_valve106.setShadow(1);
    localPanel.add(pwr_valve106, new Proportion(pwr_valve106.getBounds(), dsize));
    pwr_valve107 = new pwr_valve(session);
    pwr_valve107.setBounds(new Rectangle(534,221,17,21));
    pwr_valve107.setFillColor(214);
    pwr_valve107.setRotate(-90);
    pwr_valve107.setShadow(1);
    localPanel.add(pwr_valve107, new Proportion(pwr_valve107.getBounds(), dsize));
    pwr_valve108 = new pwr_valve(session);
    pwr_valve108.setBounds(new Rectangle(516,235,17,21));
    pwr_valve108.setFillColor(134);
    pwr_valve108.setRotate(-90);
    pwr_valve108.setShadow(1);
    localPanel.add(pwr_valve108, new Proportion(pwr_valve108.getBounds(), dsize));
    pwr_valve109 = new pwr_valve(session);
    pwr_valve109.setBounds(new Rectangle(403,391,17,21));
    pwr_valve109.setFillColor(134);
    pwr_valve109.setRotate(-90);
    pwr_valve109.setShadow(1);
    localPanel.add(pwr_valve109, new Proportion(pwr_valve109.getBounds(), dsize));
    pwr_valve110 = new pwr_valve(session);
    pwr_valve110.setBounds(new Rectangle(421,405,17,21));
    pwr_valve110.setFillColor(215);
    pwr_valve110.setRotate(-90);
    pwr_valve110.setShadow(1);
    localPanel.add(pwr_valve110, new Proportion(pwr_valve110.getBounds(), dsize));
    pwr_valve111 = new pwr_valve(session);
    pwr_valve111.setBounds(new Rectangle(481,391,17,21));
    pwr_valve111.setFillColor(134);
    pwr_valve111.setRotate(-90);
    pwr_valve111.setShadow(1);
    localPanel.add(pwr_valve111, new Proportion(pwr_valve111.getBounds(), dsize));
    pwr_valve112 = new pwr_valve(session);
    pwr_valve112.setBounds(new Rectangle(499,405,17,21));
    pwr_valve112.setFillColor(215);
    pwr_valve112.setRotate(-90);
    pwr_valve112.setShadow(1);
    localPanel.add(pwr_valve112, new Proportion(pwr_valve112.getBounds(), dsize));
    pwr_valve113 = new pwr_valve(session);
    pwr_valve113.setBounds(new Rectangle(560,391,17,21));
    pwr_valve113.setFillColor(134);
    pwr_valve113.setRotate(-90);
    pwr_valve113.setShadow(1);
    localPanel.add(pwr_valve113, new Proportion(pwr_valve113.getBounds(), dsize));
    pwr_valve114 = new pwr_valve(session);
    pwr_valve114.setBounds(new Rectangle(578,405,17,21));
    pwr_valve114.setFillColor(215);
    pwr_valve114.setRotate(-90);
    pwr_valve114.setShadow(1);
    localPanel.add(pwr_valve114, new Proportion(pwr_valve114.getBounds(), dsize));
    jopTrend115 = new JopTrend( session);
    jopTrend115.setBounds(new Rectangle(20,140,239,61));
    jopTrend115.setFillColor(39);
    jopTrend115.setBorderColor(36);
    jopTrend115.setBorderColorTrend1(5);
    jopTrend115.setBorderColorTrend2(233);
    jopTrend115.setFillColorTrend1(104);
    jopTrend115.setFillColorTrend2(214);
    jopTrend115.setDrawFill(1);
    jopTrend115.setDrawBorder(1);
    jopTrend115.setTrendBorderWidth(1);
    jopTrend115.setLineWidth(1);
    jopTrend115.setMinValue1(0F);
    jopTrend115.setMaxValue1(100F);
    jopTrend115.setMinValue2(0F);
    jopTrend115.setMaxValue2(6F);
    jopTrend115.setNoOfPoints(100);
    jopTrend115.setHorizontalLines(4);
    jopTrend115.setVerticalLines(4);
    jopTrend115.setRotate(0);
    localPanel.add(jopTrend115, new Proportion(jopTrend115.getBounds(), dsize));
    pwr_valuemedium116 = new pwr_valuemedium(session);
    pwr_valuemedium116.setBounds(new Rectangle(486,71,114,18));
    pwr_valuemedium116.setBorderColor(31);
    localPanel.add(pwr_valuemedium116, new Proportion(pwr_valuemedium116.getBounds(), dsize));
    pwr_indroundlarge117 = new pwr_indroundlarge(session);
    pwr_indroundlarge117.setBounds(new Rectangle(464,67,23,24));
    pwr_indroundlarge117.setColorTone(10);
    localPanel.add(pwr_indroundlarge117, new Proportion(pwr_indroundlarge117.getBounds(), dsize));
    pwr_sliderbackground33.dd.setDynType(524289);
    pwr_sliderbackground33.dd.setActionType(0);
    pwr_slider34.dd.setDynType(1);
    pwr_slider34.dd.setActionType(2048);
    pwr_slider34.dd.setAccess(33619964);
    pwr_slider34.dd.setElements(new GeDynElemIfc[] {
      new GeDynSlider(pwr_slider34.dd, "Demo-Process-TemperatureControl-TemperatureMode.SetVal##Float32",0,500,4,67.8065,126.319,null,null,
null)
      });
    pwr_logga18.dd.setDynType(1);
    pwr_logga18.dd.setActionType(0);
    jopSmallbutton21.dd.setDynType(1);
    jopSmallbutton21.dd.setActionType(64);
    jopSmallbutton21.dd.setAccess(33619967);
    jopSmallbutton21.dd.setElements(new GeDynElemIfc[] {
      new GeDynCommand(jopSmallbutton21.dd, "set subwindow pwrdemo/name=main/source=\"demo_proc_levelcontrol\"")
      });
    jopSmallbutton21.setAnnot1(" Previous");
    jopSmallbutton22.dd.setDynType(1);
    jopSmallbutton22.dd.setActionType(0);
    jopSmallbutton22.setAnnot1("   Next");
    pwr_buttoninfo23.dd.setDynType(1);
    pwr_buttoninfo23.dd.setActionType(16384);
    pwr_buttoninfo23.dd.setAccess(33619967);
    pwr_buttoninfo23.dd.setElements(new GeDynElemIfc[] {
      new GeDynCommand(pwr_buttoninfo23.dd, "help BaseTempSensor /helpfile=\"$pwr_lang/basecomponent_xtthelp.dat\"")
      });
    help_button25.dd.setDynType(1);
    help_button25.dd.setActionType(16384);
    help_button25.dd.setAccess(33619967);
    help_button25.dd.setElements(new GeDynElemIfc[] {
      new GeDynCommand(help_button25.dd, "help Proc_TemperatureControl")
      });
    pwr_valueinputmediumrd26.dd.setDynType(1025);
    pwr_valueinputmediumrd26.dd.setActionType(4096);
    pwr_valueinputmediumrd26.dd.setAccess(33619964);
    pwr_valueinputmediumrd26.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valueinputmediumrd26.dd, "Demo-Process-TemperatureControl-TemperatureMode.SetVal##Float32","%6.2f")
      ,new GeDynValueInput(pwr_valueinputmediumrd26.dd, 0,500,null,null)
      });
    jopSmallbutton27.dd.setDynType(1);
    jopSmallbutton27.dd.setActionType(4);
    jopSmallbutton27.dd.setAccess(33619967);
    jopSmallbutton27.dd.setElements(new GeDynElemIfc[] {
      new GeDynSetDig(jopSmallbutton27.dd, "Demo-Process-TemperatureControl-Start.ActualValue##Boolean")
      });
    jopSmallbutton27.setAnnot1("   Start");
    jopSmallbutton28.dd.setDynType(1);
    jopSmallbutton28.dd.setActionType(4);
    jopSmallbutton28.dd.setAccess(33619967);
    jopSmallbutton28.dd.setElements(new GeDynElemIfc[] {
      new GeDynSetDig(jopSmallbutton28.dd, "Demo-Process-TemperatureControl-Stop.ActualValue##Boolean")
      });
    jopSmallbutton28.setAnnot1("   Stop");
    jopTrend29.setPwrAttribute1("Demo-Process-TemperatureControl-TemperatureSensor.Value.ActualValue##Float32");
    jopTrend29.setPwrAttribute2("Demo-Process-TemperatureControl-TemperatureMode.SetVal##Float32");
    mcomp_abb_acs800fanaggr32.dd.setDynType(67108865);
    mcomp_abb_acs800fanaggr32.dd.setActionType(64);
    mcomp_abb_acs800fanaggr32.dd.setAccess(33619964);
    mcomp_abb_acs800fanaggr32.dd.setElements(new GeDynElemIfc[] {
      new GeDynHostObject(mcomp_abb_acs800fanaggr32.dd, "Demo-Process-TemperatureControl-CombustionAirFan")
      ,new GeDynDigError(mcomp_abb_acs800fanaggr32.dd, "$hostobject.IndError##Boolean")
      ,new GeDynDigWarning(mcomp_abb_acs800fanaggr32.dd, "$hostobject.IndWarning##Boolean")
      ,new GeDynDigLowColor(mcomp_abb_acs800fanaggr32.dd, "$hostobject.ACS800.ConvertRun##Boolean",37)
      ,new GeDynValue(mcomp_abb_acs800fanaggr32.dd, "$hostobject.Mode.IndMode##String8","%s")
      ,new GeDynDigShift(mcomp_abb_acs800fanaggr32.dd, "$hostobject.ACS800.ConvertRun##Boolean")
      ,new GeDynPopupMenu(mcomp_abb_acs800fanaggr32.dd, "$hostobject")
      ,new GeDynCommand(mcomp_abb_acs800fanaggr32.dd, "open graph/class/inst=Demo-Process-TemperatureControl-CombustionAirFan")
      });
    mcomp_abb_acs800fanaggr41.dd.setDynType(67108865);
    mcomp_abb_acs800fanaggr41.dd.setActionType(64);
    mcomp_abb_acs800fanaggr41.dd.setAccess(33619964);
    mcomp_abb_acs800fanaggr41.dd.setElements(new GeDynElemIfc[] {
      new GeDynHostObject(mcomp_abb_acs800fanaggr41.dd, "Demo-Process-TemperatureControl-GasFan")
      ,new GeDynDigError(mcomp_abb_acs800fanaggr41.dd, "$hostobject.IndError##Boolean")
      ,new GeDynDigWarning(mcomp_abb_acs800fanaggr41.dd, "$hostobject.IndWarning##Boolean")
      ,new GeDynDigLowColor(mcomp_abb_acs800fanaggr41.dd, "$hostobject.ACS800.ConvertRun##Boolean",37)
      ,new GeDynValue(mcomp_abb_acs800fanaggr41.dd, "$hostobject.Mode.IndMode##String8","%s")
      ,new GeDynDigShift(mcomp_abb_acs800fanaggr41.dd, "$hostobject.ACS800.ConvertRun##Boolean")
      ,new GeDynPopupMenu(mcomp_abb_acs800fanaggr41.dd, "$hostobject")
      ,new GeDynCommand(mcomp_abb_acs800fanaggr41.dd, "open graph/class/inst=Demo-Process-TemperatureControl-GasFan")
      });
    bcomp_mvalve50.dd.setDynType(67108865);
    bcomp_mvalve50.dd.setActionType(64);
    bcomp_mvalve50.dd.setAccess(33619964);
    bcomp_mvalve50.dd.setElements(new GeDynElemIfc[] {
      new GeDynHostObject(bcomp_mvalve50.dd, "Demo-Process-TemperatureControl-GasValve")
      ,new GeDynDigFlash(bcomp_mvalve50.dd, "$hostobject.IndError##Boolean",176,29)
      ,new GeDynDigWarning(bcomp_mvalve50.dd, "$hostobject.IndWarning##Boolean")
      ,new GeDynAnalogColor(bcomp_mvalve50.dd, "",1,4,30)
      ,new GeDynAnalogColor(bcomp_mvalve50.dd, "$hostobject.PosEnum##Int32",0,4,35)
      ,new GeDynValue(bcomp_mvalve50.dd, "$hostobject.Mode.IndMode##String8","%s")
      ,new GeDynPopupMenu(bcomp_mvalve50.dd, "$hostobject")
      ,new GeDynCommand(bcomp_mvalve50.dd, "open graph/class/inst=Demo-Process-TemperatureControl-GasValve")
      });
    bcomp_pressuresensor52.dd.setDynType(67108865);
    bcomp_pressuresensor52.dd.setActionType(64);
    bcomp_pressuresensor52.dd.setAccess(33619964);
    bcomp_pressuresensor52.dd.setElements(new GeDynElemIfc[] {
      new GeDynHostObject(bcomp_pressuresensor52.dd, "Demo-Process-TemperatureControl-GasPressureSensor")
      ,new GeDynDigFlash(bcomp_pressuresensor52.dd, "$hostobject.IndError##Boolean",29,9999)
      ,new GeDynDigError(bcomp_pressuresensor52.dd, "$hostobject.IndError##Boolean")
      ,new GeDynDigWarning(bcomp_pressuresensor52.dd, "$hostobject.IndWarning##Boolean")
      ,new GeDynPopupMenu(bcomp_pressuresensor52.dd, "$hostobject")
      ,new GeDynCommand(bcomp_pressuresensor52.dd, "open graph/class/inst=Demo-Process-TemperatureControl-GasPressureSensor")
      });
    pwr_pidcontroller67.dd.setDynType(1);
    pwr_pidcontroller67.dd.setActionType(66);
    pwr_pidcontroller67.dd.setAccess(33619964);
    pwr_pidcontroller67.dd.setElements(new GeDynElemIfc[] {
      new GeDynPopupMenu(pwr_pidcontroller67.dd, "Demo-Process-TemperatureControl-GasPressureMode")
      ,new GeDynCommand(pwr_pidcontroller67.dd, "open graph/class/inst=Demo-Process-TemperatureControl-GasPressureMode")
      });
    pwr_pidcontroller67.setAnnot1("PC1");
    bcomp_pressuresensor69.dd.setDynType(67108865);
    bcomp_pressuresensor69.dd.setActionType(64);
    bcomp_pressuresensor69.dd.setAccess(33619964);
    bcomp_pressuresensor69.dd.setElements(new GeDynElemIfc[] {
      new GeDynHostObject(bcomp_pressuresensor69.dd, "Demo-Process-TemperatureControl-AirPressureSensor")
      ,new GeDynDigFlash(bcomp_pressuresensor69.dd, "$hostobject.IndError##Boolean",29,9999)
      ,new GeDynDigError(bcomp_pressuresensor69.dd, "$hostobject.IndError##Boolean")
      ,new GeDynDigWarning(bcomp_pressuresensor69.dd, "$hostobject.IndWarning##Boolean")
      ,new GeDynPopupMenu(bcomp_pressuresensor69.dd, "$hostobject")
      ,new GeDynCommand(bcomp_pressuresensor69.dd, "open graph/class/inst=Demo-Process-TemperatureControl-AirPressureSensor")
      });
    pwr_pidcontroller71.dd.setDynType(1);
    pwr_pidcontroller71.dd.setActionType(66);
    pwr_pidcontroller71.dd.setAccess(33619964);
    pwr_pidcontroller71.dd.setElements(new GeDynElemIfc[] {
      new GeDynPopupMenu(pwr_pidcontroller71.dd, "Demo-Process-TemperatureControl-AirPressureMode")
      ,new GeDynCommand(pwr_pidcontroller71.dd, "open graph/class/inst=Demo-Process-TemperatureControl-AirPressureMode")
      });
    pwr_pidcontroller71.setAnnot1("PC2");
    pwr_valuemedium72.dd.setDynType(1025);
    pwr_valuemedium72.dd.setActionType(0);
    pwr_valuemedium72.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuemedium72.dd, "Demo-Process-TemperatureControl-GasPressureSensor.Value.ActualValue##Float32","%5.2f")
      });
    pwr_valuemedium73.dd.setDynType(1025);
    pwr_valuemedium73.dd.setActionType(0);
    pwr_valuemedium73.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuemedium73.dd, "Demo-Process-TemperatureControl-AirPressureSensor.Value.ActualValue##Float32","%5.2f")
      });
    bcomp_pressureswitch74.dd.setDynType(67108865);
    bcomp_pressureswitch74.dd.setActionType(64);
    bcomp_pressureswitch74.dd.setAccess(33619964);
    bcomp_pressureswitch74.dd.setElements(new GeDynElemIfc[] {
      new GeDynHostObject(bcomp_pressureswitch74.dd, "Demo-Process-TemperatureControl-AirPressureSwitch")
      ,new GeDynDigFlash(bcomp_pressureswitch74.dd, "$hostobject.AlarmStatus##Boolean",29,9999)
      ,new GeDynDigError(bcomp_pressureswitch74.dd, "$hostobject.AlarmStatus##Boolean")
      ,new GeDynPopupMenu(bcomp_pressureswitch74.dd, "$hostobject")
      ,new GeDynCommand(bcomp_pressureswitch74.dd, "open graph/class/inst=Demo-Process-TemperatureControl-AirPressureSwitch")
      });
    bcomp_pressureswitch76.dd.setDynType(67108865);
    bcomp_pressureswitch76.dd.setActionType(64);
    bcomp_pressureswitch76.dd.setAccess(33619964);
    bcomp_pressureswitch76.dd.setElements(new GeDynElemIfc[] {
      new GeDynHostObject(bcomp_pressureswitch76.dd, "Demo-Process-TemperatureControl-GasPressureSwitch")
      ,new GeDynDigFlash(bcomp_pressureswitch76.dd, "$hostobject.AlarmStatus##Boolean",29,9999)
      ,new GeDynDigError(bcomp_pressureswitch76.dd, "$hostobject.AlarmStatus##Boolean")
      ,new GeDynPopupMenu(bcomp_pressureswitch76.dd, "$hostobject")
      ,new GeDynCommand(bcomp_pressureswitch76.dd, "open graph/class/inst=Demo-Process-TemperatureControl-GasPressureSwitch")
      });
    pwr_valuemedium78.dd.setDynType(1025);
    pwr_valuemedium78.dd.setActionType(0);
    pwr_valuemedium78.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuemedium78.dd, "Demo-Process-TemperatureControl-TemperatureSensor.Value.ActualValue##Float32","%5.2f")
      });
    bcomp_tempsensor81.dd.setDynType(67108865);
    bcomp_tempsensor81.dd.setActionType(64);
    bcomp_tempsensor81.dd.setAccess(33619964);
    bcomp_tempsensor81.dd.setElements(new GeDynElemIfc[] {
      new GeDynHostObject(bcomp_tempsensor81.dd, "Demo-Process-TemperatureControl-TemperatureSensor")
      ,new GeDynDigFlash(bcomp_tempsensor81.dd, "$hostobject.IndError##Boolean",29,9999)
      ,new GeDynDigError(bcomp_tempsensor81.dd, "$hostobject.IndError##Boolean")
      ,new GeDynDigWarning(bcomp_tempsensor81.dd, "$hostobject.IndWarning##Boolean")
      ,new GeDynPopupMenu(bcomp_tempsensor81.dd, "$hostobject")
      ,new GeDynCommand(bcomp_tempsensor81.dd, "open graph/class/inst=Demo-Process-TemperatureControl-TemperatureSensor")
      });
    pwr_pidcontroller95.dd.setDynType(1);
    pwr_pidcontroller95.dd.setActionType(66);
    pwr_pidcontroller95.dd.setAccess(33619964);
    pwr_pidcontroller95.dd.setElements(new GeDynElemIfc[] {
      new GeDynPopupMenu(pwr_pidcontroller95.dd, "Demo-Process-TemperatureControl-TemperatureMode")
      ,new GeDynCommand(pwr_pidcontroller95.dd, "open graph/class/inst=Demo-Process-TemperatureControl-TemperatureMode")
      });
    pwr_pidcontroller95.setAnnot1("TC1");
    pwr_burner97.dd.setDynType(5);
    pwr_burner97.dd.setActionType(0);
    pwr_burner97.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_burner97.dd, "!Demo-Process-TemperatureControl-Burner1-GasValve.SwitchClosed.ActualValue##Boolean",39)
      });
    pwr_burner98.dd.setDynType(5);
    pwr_burner98.dd.setActionType(0);
    pwr_burner98.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_burner98.dd, "!Demo-Process-TemperatureControl-Burner2-GasValve.SwitchClosed.ActualValue##Boolean",39)
      });
    pwr_burner99.dd.setDynType(5);
    pwr_burner99.dd.setActionType(0);
    pwr_burner99.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_burner99.dd, "!Demo-Process-TemperatureControl-Burner3-GasValve.SwitchClosed.ActualValue##Boolean",39)
      });
    pwr_burner100.dd.setDynType(5);
    pwr_burner100.dd.setActionType(0);
    pwr_burner100.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_burner100.dd, "!Demo-Process-TemperatureControl-Burner4-GasValve.SwitchClosed.ActualValue##Boolean",39)
      });
    pwr_burner101.dd.setDynType(5);
    pwr_burner101.dd.setActionType(0);
    pwr_burner101.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_burner101.dd, "!Demo-Process-TemperatureControl-Burner5-GasValve.SwitchClosed.ActualValue##Boolean",39)
      });
    pwr_burner102.dd.setDynType(5);
    pwr_burner102.dd.setActionType(0);
    pwr_burner102.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_burner102.dd, "!Demo-Process-TemperatureControl-Burner6-GasValve.SwitchClosed.ActualValue##Boolean",39)
      });
    pwr_valve103.dd.setDynType(21);
    pwr_valve103.dd.setActionType(0);
    pwr_valve103.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigError(pwr_valve103.dd, "")
      ,new GeDynDigLowColor(pwr_valve103.dd, "!Demo-Process-TemperatureControl-Burner1-GasValve.SwitchClosed.ActualValue##Boolean",3)
      });
    pwr_valve104.dd.setDynType(21);
    pwr_valve104.dd.setActionType(0);
    pwr_valve104.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigError(pwr_valve104.dd, "")
      ,new GeDynDigLowColor(pwr_valve104.dd, "!Demo-Process-TemperatureControl-Burner1-AirValve.SwitchClosed.ActualValue##Boolean",3)
      });
    pwr_valve105.dd.setDynType(21);
    pwr_valve105.dd.setActionType(0);
    pwr_valve105.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigError(pwr_valve105.dd, "")
      ,new GeDynDigLowColor(pwr_valve105.dd, "!Demo-Process-TemperatureControl-Burner2-GasValve.SwitchClosed.ActualValue##Boolean",3)
      });
    pwr_valve106.dd.setDynType(21);
    pwr_valve106.dd.setActionType(0);
    pwr_valve106.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigError(pwr_valve106.dd, "")
      ,new GeDynDigLowColor(pwr_valve106.dd, "!Demo-Process-TemperatureControl-Burner2-AirValve.SwitchClosed.ActualValue##Boolean",3)
      });
    pwr_valve107.dd.setDynType(21);
    pwr_valve107.dd.setActionType(0);
    pwr_valve107.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigError(pwr_valve107.dd, "")
      ,new GeDynDigLowColor(pwr_valve107.dd, "!Demo-Process-TemperatureControl-Burner3-AirValve.SwitchClosed.ActualValue##Boolean",3)
      });
    pwr_valve108.dd.setDynType(21);
    pwr_valve108.dd.setActionType(0);
    pwr_valve108.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigError(pwr_valve108.dd, "")
      ,new GeDynDigLowColor(pwr_valve108.dd, "!Demo-Process-TemperatureControl-Burner3-GasValve.SwitchClosed.ActualValue##Boolean",3)
      });
    pwr_valve109.dd.setDynType(21);
    pwr_valve109.dd.setActionType(0);
    pwr_valve109.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigError(pwr_valve109.dd, "")
      ,new GeDynDigLowColor(pwr_valve109.dd, "!Demo-Process-TemperatureControl-Burner4-GasValve.SwitchClosed.ActualValue##Boolean",3)
      });
    pwr_valve110.dd.setDynType(21);
    pwr_valve110.dd.setActionType(0);
    pwr_valve110.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigError(pwr_valve110.dd, "")
      ,new GeDynDigLowColor(pwr_valve110.dd, "!Demo-Process-TemperatureControl-Burner4-AirValve.SwitchClosed.ActualValue##Boolean",3)
      });
    pwr_valve111.dd.setDynType(21);
    pwr_valve111.dd.setActionType(0);
    pwr_valve111.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigError(pwr_valve111.dd, "")
      ,new GeDynDigLowColor(pwr_valve111.dd, "!Demo-Process-TemperatureControl-Burner5-GasValve.SwitchClosed.ActualValue##Boolean",3)
      });
    pwr_valve112.dd.setDynType(21);
    pwr_valve112.dd.setActionType(0);
    pwr_valve112.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigError(pwr_valve112.dd, "")
      ,new GeDynDigLowColor(pwr_valve112.dd, "!Demo-Process-TemperatureControl-Burner5-AirValve.SwitchClosed.ActualValue##Boolean",3)
      });
    pwr_valve113.dd.setDynType(21);
    pwr_valve113.dd.setActionType(0);
    pwr_valve113.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigError(pwr_valve113.dd, "")
      ,new GeDynDigLowColor(pwr_valve113.dd, "!Demo-Process-TemperatureControl-Burner6-GasValve.SwitchClosed.ActualValue##Boolean",3)
      });
    pwr_valve114.dd.setDynType(21);
    pwr_valve114.dd.setActionType(0);
    pwr_valve114.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigError(pwr_valve114.dd, "")
      ,new GeDynDigLowColor(pwr_valve114.dd, "!Demo-Process-TemperatureControl-Burner6-AirValve.SwitchClosed.ActualValue##Boolean",3)
      });
    jopTrend115.setPwrAttribute1("Demo-Process-TemperatureControl-TemperatureMode.OutVal##Float32");
    jopTrend115.setPwrAttribute2("Demo-Process-TemperatureControl-NoOfBurningBurners.ActualValue##Int32");
    pwr_valuemedium116.dd.setDynType(8388608);
    pwr_valuemedium116.dd.setActionType(0);
    pwr_valuemedium116.dd.setElements(new GeDynElemIfc[] {
      new GeDynAnalogText(pwr_valuemedium116.dd, "Demo-Process-TemperatureControl-State.ActualValue##Int32", new String[] {
        "Off","Starting Air Fan","Starting Gas Fan","Opening Gas Valve","On",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null},
        new int[] {
        0,1,2,3,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
      })
      });
    pwr_indroundlarge117.dd.setDynType(10);
    pwr_indroundlarge117.dd.setActionType(0);
    pwr_indroundlarge117.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigColor(pwr_indroundlarge117.dd, "Demo-Process-TemperatureControl-ZoneSequence.Executing##Boolean",9)
      ,new GeDynDigColor(pwr_indroundlarge117.dd, "!Demo-Process-TemperatureControl-Plc-W-IS0.Order[0]##Boolean",3)
      });
    engine.setFrameReady();
  }

class LocalPanel extends JPanel {
  public LocalPanel() {}
  int fillColor = 9999;
  int originalFillColor = 9999;
  int textColor = 9999;
  int originalTextColor = 9999;
  int borderColor = 9999;
  int colorTone = 0;
  int originalColorTone = 0;
  int colorShift = 0;
  int originalColorShift = 0;
  int colorBrightness = 0;
  int originalColorBrightness = 0;
  int colorIntensity = 0;
  int originalColorIntensity = 0;
  int colorInverse = 0;
  int originalColorInverse = 0;
  int shadow = 0;
  boolean dimmed = false;
  public void setColorTone( int colorTone) {
    this.colorTone = colorTone;
    originalColorTone = colorTone;
  }
  public int getColorTone() {
    return colorTone;
  }
  public void setColorShift( int colorShift) {
    this.colorShift = colorShift;
    originalColorShift = colorShift;
  }
  public int getColorShift() {
    return colorShift;
  }
  public void setColorBrightness( int colorBrightness) {
    this.colorBrightness = colorBrightness;
    originalColorBrightness = colorBrightness;
  }
  public int getColorBrightness() {
    return colorBrightness;
  }
  public void setColorIntensity( int colorIntensity) {
    this.colorIntensity = colorIntensity;
    originalColorIntensity = colorIntensity;
  }
  public int getColorIntensity() {
    return colorIntensity;
  }
  public void setFillColor( int fillColor) {
    this.fillColor = fillColor;
    this.originalFillColor = fillColor;
  }
  public void resetFillColor() {
    fillColor = originalFillColor;
  }
  public int getFillColor() {
    return fillColor;
  }
  public void setBorderColor( int borderColor) {
    this.borderColor = borderColor;
  }
  public int getBorderColor() {
    return borderColor;
  }
  public int original_width = 603;
  public int original_height = 509;
  double rotate;
  public void setRotate( double rotate) {
    if ( rotate < 0)
      this.rotate = rotate % 360 + 360;
    else
      this.rotate = rotate % 360;
  }
  public double getRotate() { return rotate;}
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(1.1279F, 54.3255F, 611.293F, 7.21459F),
    new Polygon( new int[] { 1, 612, 612, 1, 1, 1}, new int[] { 54, 54, 55, 55, 61, 62}, 6), 
    new Polygon( new int[] { 612, 612, 612, 612, 1, 1}, new int[] { 62, 54, 55, 61, 61, 62}, 6), 
    new Rectangle2D.Float(1.1279F, -0.616279F, 611.293F, 22.6744F),
    new Polygon( new int[] { 1, 612, 611, 2, 2, 1}, new int[] { 0, 0, 1, 1, 21, 22}, 6), 
    new Polygon( new int[] { 612, 612, 611, 611, 2, 1}, new int[] { 22, 0, 1, 21, 21, 22}, 6), 
    new Rectangle2D.Float(303.74F, 65.9999F, 305.259F, 27.9998F),
    new Polygon( new int[] { 304, 609, 608, 305, 305, 304}, new int[] { 66, 66, 67, 67, 93, 94}, 6), 
    new Polygon( new int[] { 609, 609, 608, 608, 305, 304}, new int[] { 94, 66, 67, 93, 93, 94}, 6), 
    new Rectangle2D.Float(17.537F, 139.535F, 244.862F, 65.0862F),
    new Polygon( new int[] { 18, 262, 256, 24, 24, 18}, new int[] { 140, 140, 146, 146, 198, 205}, 6), 
    new Polygon( new int[] { 262, 262, 256, 256, 24, 18}, new int[] { 205, 140, 146, 198, 198, 205}, 6), 
    new Rectangle2D.Float(17.537F, 71.3979F, 244.862F, 65.0862F),
    new Polygon( new int[] { 18, 262, 256, 24, 24, 18}, new int[] { 71, 71, 78, 78, 130, 136}, 6), 
    new Polygon( new int[] { 262, 262, 256, 256, 24, 18}, new int[] { 136, 71, 78, 130, 130, 136}, 6), 
    new Rectangle2D.Float(542F, 255F, 3F, 9F),
    new Line2D.Float( 543F, 255F, 543F, 263F),
    new Line2D.Float( 543F, 263F, 543F, 263F),
    new Line2D.Float( 543F, 255F, 543F, 263F),
    new Line2D.Float( 542F, 255F, 542F, 264F),
    new Line2D.Float( 544F, 255F, 544F, 264F),
    new Line2D.Float( 542F, 264F, 544F, 264F),
    new Rectangle2D.Float(463F, 255F, 3F, 9F),
    new Line2D.Float( 464F, 255F, 464F, 263F),
    new Line2D.Float( 464F, 263F, 464F, 263F),
    new Line2D.Float( 464F, 255F, 464F, 263F),
    new Line2D.Float( 463F, 255F, 463F, 264F),
    new Line2D.Float( 465F, 255F, 465F, 264F),
    new Line2D.Float( 463F, 264F, 465F, 264F),
    new Rectangle2D.Float(385F, 255F, 3F, 9F),
    new Line2D.Float( 386F, 255F, 386F, 263F),
    new Line2D.Float( 386F, 263F, 386F, 263F),
    new Line2D.Float( 386F, 255F, 386F, 263F),
    new Line2D.Float( 385F, 255F, 385F, 264F),
    new Line2D.Float( 387F, 255F, 387F, 264F),
    new Line2D.Float( 385F, 264F, 387F, 264F),
    new Rectangle2D.Float(524F, 255F, 3F, 9F),
    new Line2D.Float( 525F, 255F, 525F, 263F),
    new Line2D.Float( 525F, 263F, 525F, 263F),
    new Line2D.Float( 525F, 255F, 525F, 263F),
    new Line2D.Float( 524F, 255F, 524F, 264F),
    new Line2D.Float( 526F, 255F, 526F, 264F),
    new Line2D.Float( 524F, 264F, 526F, 264F),
    new Rectangle2D.Float(446F, 255F, 3F, 9F),
    new Line2D.Float( 447F, 255F, 447F, 263F),
    new Line2D.Float( 447F, 263F, 447F, 263F),
    new Line2D.Float( 447F, 255F, 447F, 263F),
    new Line2D.Float( 446F, 255F, 446F, 264F),
    new Line2D.Float( 448F, 255F, 448F, 264F),
    new Line2D.Float( 446F, 264F, 448F, 264F),
    new Rectangle2D.Float(367F, 255F, 3F, 9F),
    new Line2D.Float( 368F, 255F, 368F, 263F),
    new Line2D.Float( 368F, 263F, 368F, 263F),
    new Line2D.Float( 368F, 255F, 368F, 263F),
    new Line2D.Float( 367F, 255F, 367F, 264F),
    new Line2D.Float( 369F, 255F, 369F, 264F),
    new Line2D.Float( 367F, 264F, 369F, 264F),
    new Rectangle2D.Float(585F, 377F, 3F, 9F),
    new Line2D.Float( 586F, 378F, 586F, 386F),
    new Line2D.Float( 586F, 378F, 586F, 386F),
    new Line2D.Float( 586F, 378F, 586F, 378F),
    new Line2D.Float( 585F, 377F, 585F, 386F),
    new Line2D.Float( 587F, 377F, 587F, 386F),
    new Line2D.Float( 585F, 377F, 587F, 377F),
    new Rectangle2D.Float(507F, 377F, 3F, 9F),
    new Line2D.Float( 508F, 378F, 508F, 386F),
    new Line2D.Float( 508F, 378F, 508F, 386F),
    new Line2D.Float( 508F, 378F, 508F, 378F),
    new Line2D.Float( 507F, 377F, 507F, 386F),
    new Line2D.Float( 509F, 377F, 509F, 386F),
    new Line2D.Float( 507F, 377F, 509F, 377F),
    new Rectangle2D.Float(568F, 377F, 3F, 9F),
    new Line2D.Float( 569F, 378F, 569F, 386F),
    new Line2D.Float( 569F, 378F, 569F, 386F),
    new Line2D.Float( 569F, 378F, 569F, 378F),
    new Line2D.Float( 568F, 377F, 568F, 386F),
    new Line2D.Float( 570F, 377F, 570F, 386F),
    new Line2D.Float( 568F, 377F, 570F, 377F),
    new Rectangle2D.Float(489F, 377F, 3F, 9F),
    new Line2D.Float( 490F, 378F, 490F, 386F),
    new Line2D.Float( 490F, 378F, 490F, 386F),
    new Line2D.Float( 490F, 378F, 490F, 378F),
    new Line2D.Float( 489F, 377F, 489F, 386F),
    new Line2D.Float( 491F, 377F, 491F, 386F),
    new Line2D.Float( 489F, 377F, 491F, 377F),
    new Rectangle2D.Float(411F, 377F, 3F, 9F),
    new Line2D.Float( 412F, 378F, 412F, 386F),
    new Line2D.Float( 412F, 378F, 412F, 386F),
    new Line2D.Float( 412F, 378F, 412F, 378F),
    new Line2D.Float( 411F, 377F, 411F, 386F),
    new Line2D.Float( 413F, 377F, 413F, 386F),
    new Line2D.Float( 411F, 377F, 413F, 377F),
    new Line2D.Float( 612.465F, 54.3256F, 2F, 54.3256F),
    new Rectangle2D.Float(9F, 426F, 8F, 6F),
    new Line2D.Float( 10F, 430F, 17F, 430F),
    new Line2D.Float( 10F, 427F, 17F, 427F),
    new Line2D.Float( 10F, 427F, 10F, 430F),
    new Line2D.Float( 9F, 426F, 17F, 426F),
    new Line2D.Float( 9F, 431F, 17F, 431F),
    new Line2D.Float( 9F, 426F, 9F, 431F),
    new Rectangle2D.Float(279F, 426F, 9F, 6F),
    new Rectangle2D.Float(285F, 426F, 6F, 12F),
    new Rectangle2D.Float(285F, 421F, 6F, 10F),
    new Line2D.Float( 279F, 427F, 286F, 427F),
    new Line2D.Float( 286F, 421F, 286F, 427F),
    new Line2D.Float( 286F, 430F, 286F, 438F),
    new Line2D.Float( 279F, 430F, 286F, 430F),
    new Line2D.Float( 289F, 421F, 289F, 438F),
    new Line2D.Float( 279F, 426F, 285F, 426F),
    new Line2D.Float( 285F, 421F, 285F, 426F),
    new Line2D.Float( 279F, 431F, 285F, 431F),
    new Line2D.Float( 285F, 431F, 285F, 438F),
    new Line2D.Float( 290F, 421F, 290F, 438F),
    new Rectangle2D.Float(428F, 455F, 3F, 10F),
    new Rectangle2D.Float(421F, 461F, 9F, 6F),
    new Rectangle2D.Float(428F, 461F, 10F, 6F),
    new Line2D.Float( 421F, 462F, 429F, 462F),
    new Line2D.Float( 429F, 455F, 429F, 462F),
    new Line2D.Float( 429F, 462F, 438F, 462F),
    new Line2D.Float( 429F, 455F, 429F, 462F),
    new Line2D.Float( 421F, 465F, 438F, 465F),
    new Line2D.Float( 421F, 461F, 428F, 461F),
    new Line2D.Float( 428F, 455F, 428F, 461F),
    new Line2D.Float( 430F, 461F, 438F, 461F),
    new Line2D.Float( 430F, 455F, 430F, 461F),
    new Line2D.Float( 421F, 466F, 438F, 466F),
    new Rectangle2D.Float(385F, 203F, 3F, 8F),
    new Rectangle2D.Float(377F, 200F, 10F, 6F),
    new Rectangle2D.Float(385F, 200F, 9F, 6F),
    new Line2D.Float( 386F, 204F, 386F, 211F),
    new Line2D.Float( 377F, 201F, 394F, 201F),
    new Line2D.Float( 377F, 204F, 386F, 204F),
    new Line2D.Float( 386F, 204F, 394F, 204F),
    new Line2D.Float( 386F, 204F, 386F, 211F),
    new Line2D.Float( 377F, 205F, 385F, 205F),
    new Line2D.Float( 385F, 205F, 385F, 211F),
    new Line2D.Float( 387F, 205F, 394F, 205F),
    new Line2D.Float( 387F, 205F, 387F, 211F),
    new Line2D.Float( 377F, 200F, 394F, 200F),
    new Rectangle2D.Float(463F, 203F, 3F, 8F),
    new Rectangle2D.Float(455F, 200F, 10F, 6F),
    new Rectangle2D.Float(463F, 200F, 10F, 6F),
    new Line2D.Float( 464F, 204F, 464F, 211F),
    new Line2D.Float( 455F, 201F, 473F, 201F),
    new Line2D.Float( 455F, 204F, 464F, 204F),
    new Line2D.Float( 464F, 204F, 473F, 204F),
    new Line2D.Float( 464F, 204F, 464F, 211F),
    new Line2D.Float( 455F, 205F, 463F, 205F),
    new Line2D.Float( 463F, 205F, 463F, 211F),
    new Line2D.Float( 465F, 205F, 473F, 205F),
    new Line2D.Float( 465F, 205F, 465F, 211F),
    new Line2D.Float( 455F, 200F, 473F, 200F),
    new Rectangle2D.Float(542F, 205F, 3F, 6F),
    new Rectangle2D.Float(534F, 200F, 11F, 6F),
    new Line2D.Float( 534F, 201F, 543F, 201F),
    new Line2D.Float( 543F, 204F, 543F, 211F),
    new Line2D.Float( 534F, 204F, 543F, 204F),
    new Line2D.Float( 543F, 201F, 543F, 211F),
    new Line2D.Float( 534F, 200F, 544F, 200F),
    new Line2D.Float( 534F, 205F, 542F, 205F),
    new Line2D.Float( 542F, 205F, 542F, 211F),
    new Line2D.Float( 544F, 200F, 544F, 211F),
    new Rectangle2D.Float(507F, 455F, 3F, 10F),
    new Rectangle2D.Float(499F, 461F, 10F, 6F),
    new Rectangle2D.Float(507F, 461F, 10F, 6F),
    new Line2D.Float( 499F, 462F, 508F, 462F),
    new Line2D.Float( 508F, 455F, 508F, 462F),
    new Line2D.Float( 508F, 462F, 517F, 462F),
    new Line2D.Float( 508F, 455F, 508F, 462F),
    new Line2D.Float( 499F, 465F, 517F, 465F),
    new Line2D.Float( 499F, 461F, 507F, 461F),
    new Line2D.Float( 507F, 455F, 507F, 461F),
    new Line2D.Float( 509F, 461F, 517F, 461F),
    new Line2D.Float( 509F, 455F, 509F, 461F),
    new Line2D.Float( 499F, 466F, 517F, 466F),
    new Rectangle2D.Float(585F, 455F, 3F, 12F),
    new Rectangle2D.Float(578F, 461F, 7F, 6F),
    new Line2D.Float( 578F, 462F, 586F, 462F),
    new Line2D.Float( 586F, 455F, 586F, 462F),
    new Line2D.Float( 578F, 465F, 586F, 465F),
    new Line2D.Float( 586F, 455F, 586F, 465F),
    new Line2D.Float( 578F, 461F, 585F, 461F),
    new Line2D.Float( 578F, 466F, 587F, 466F),
    new Line2D.Float( 587F, 455F, 587F, 466F),
    new Line2D.Float( 585F, 455F, 585F, 461F),
    new Rectangle2D.Float(11F, 304F, 8F, 6F),
    new Line2D.Float( 12F, 308F, 19F, 308F),
    new Line2D.Float( 12F, 305F, 19F, 305F),
    new Line2D.Float( 12F, 305F, 12F, 308F),
    new Line2D.Float( 11F, 304F, 19F, 304F),
    new Line2D.Float( 11F, 309F, 19F, 309F),
    new Line2D.Float( 11F, 304F, 11F, 309F),
    new Rectangle2D.Float(367F, 176F, 3F, 9F),
    new Rectangle2D.Float(360F, 173F, 9F, 6F),
    new Rectangle2D.Float(367F, 173F, 10F, 6F),
    new Line2D.Float( 368F, 177F, 368F, 185F),
    new Line2D.Float( 360F, 174F, 377F, 174F),
    new Line2D.Float( 360F, 177F, 368F, 177F),
    new Line2D.Float( 368F, 177F, 377F, 177F),
    new Line2D.Float( 368F, 177F, 368F, 185F),
    new Line2D.Float( 360F, 178F, 367F, 178F),
    new Line2D.Float( 367F, 178F, 367F, 185F),
    new Line2D.Float( 369F, 178F, 377F, 178F),
    new Line2D.Float( 369F, 178F, 369F, 185F),
    new Line2D.Float( 360F, 173F, 377F, 173F),
    new Rectangle2D.Float(446F, 176F, 3F, 9F),
    new Rectangle2D.Float(438F, 173F, 10F, 6F),
    new Rectangle2D.Float(446F, 173F, 9F, 6F),
    new Line2D.Float( 447F, 177F, 447F, 185F),
    new Line2D.Float( 438F, 174F, 455F, 174F),
    new Line2D.Float( 438F, 177F, 447F, 177F),
    new Line2D.Float( 447F, 177F, 455F, 177F),
    new Line2D.Float( 447F, 177F, 447F, 185F),
    new Line2D.Float( 438F, 178F, 446F, 178F),
    new Line2D.Float( 446F, 178F, 446F, 185F),
    new Line2D.Float( 448F, 178F, 455F, 178F),
    new Line2D.Float( 448F, 178F, 448F, 185F),
    new Line2D.Float( 438F, 173F, 455F, 173F),
    new Rectangle2D.Float(524F, 178F, 3F, 7F),
    new Rectangle2D.Float(517F, 173F, 10F, 6F),
    new Line2D.Float( 517F, 174F, 525F, 174F),
    new Line2D.Float( 525F, 177F, 525F, 185F),
    new Line2D.Float( 517F, 177F, 525F, 177F),
    new Line2D.Float( 525F, 174F, 525F, 185F),
    new Line2D.Float( 517F, 173F, 526F, 173F),
    new Line2D.Float( 517F, 178F, 524F, 178F),
    new Line2D.Float( 524F, 178F, 524F, 185F),
    new Line2D.Float( 526F, 173F, 526F, 185F),
    new Rectangle2D.Float(307F, 304F, 9F, 6F),
    new Rectangle2D.Float(313F, 304F, 6F, 12F),
    new Rectangle2D.Float(313F, 299F, 6F, 10F),
    new Line2D.Float( 307F, 305F, 314F, 305F),
    new Line2D.Float( 314F, 299F, 314F, 305F),
    new Line2D.Float( 314F, 308F, 314F, 316F),
    new Line2D.Float( 307F, 308F, 314F, 308F),
    new Line2D.Float( 317F, 299F, 317F, 316F),
    new Line2D.Float( 307F, 304F, 313F, 304F),
    new Line2D.Float( 313F, 299F, 313F, 304F),
    new Line2D.Float( 307F, 309F, 313F, 309F),
    new Line2D.Float( 313F, 309F, 313F, 316F),
    new Line2D.Float( 318F, 299F, 318F, 316F),
    new Rectangle2D.Float(411F, 429F, 3F, 10F),
    new Rectangle2D.Float(403F, 435F, 10F, 6F),
    new Rectangle2D.Float(411F, 435F, 10F, 6F),
    new Line2D.Float( 403F, 436F, 412F, 436F),
    new Line2D.Float( 412F, 429F, 412F, 436F),
    new Line2D.Float( 412F, 436F, 421F, 436F),
    new Line2D.Float( 412F, 429F, 412F, 436F),
    new Line2D.Float( 403F, 439F, 421F, 439F),
    new Line2D.Float( 403F, 435F, 411F, 435F),
    new Line2D.Float( 411F, 429F, 411F, 435F),
    new Line2D.Float( 413F, 435F, 421F, 435F),
    new Line2D.Float( 413F, 429F, 413F, 435F),
    new Line2D.Float( 403F, 440F, 421F, 440F),
    new Rectangle2D.Float(489F, 429F, 3F, 10F),
    new Rectangle2D.Float(482F, 435F, 9F, 6F),
    new Rectangle2D.Float(489F, 435F, 10F, 6F),
    new Line2D.Float( 482F, 436F, 490F, 436F),
    new Line2D.Float( 490F, 429F, 490F, 436F),
    new Line2D.Float( 490F, 436F, 499F, 436F),
    new Line2D.Float( 490F, 429F, 490F, 436F),
    new Line2D.Float( 482F, 439F, 499F, 439F),
    new Line2D.Float( 482F, 435F, 489F, 435F),
    new Line2D.Float( 489F, 429F, 489F, 435F),
    new Line2D.Float( 491F, 435F, 499F, 435F),
    new Line2D.Float( 491F, 429F, 491F, 435F),
    new Line2D.Float( 482F, 440F, 499F, 440F),
    new Rectangle2D.Float(568F, 429F, 3F, 12F),
    new Rectangle2D.Float(560F, 435F, 8F, 6F),
    new Line2D.Float( 560F, 436F, 569F, 436F),
    new Line2D.Float( 569F, 429F, 569F, 436F),
    new Line2D.Float( 560F, 439F, 569F, 439F),
    new Line2D.Float( 569F, 429F, 569F, 439F),
    new Line2D.Float( 560F, 435F, 568F, 435F),
    new Line2D.Float( 560F, 440F, 570F, 440F),
    new Line2D.Float( 570F, 429F, 570F, 440F),
    new Line2D.Float( 568F, 429F, 568F, 435F),
    new Rectangle2D.Float(428F, 384F, 3F, 9F),
    new Line2D.Float( 429F, 385F, 429F, 393F),
    new Line2D.Float( 429F, 385F, 429F, 393F),
    new Line2D.Float( 429F, 385F, 429F, 385F),
    new Line2D.Float( 428F, 384F, 428F, 393F),
    new Line2D.Float( 430F, 384F, 430F, 393F),
    new Line2D.Float( 428F, 384F, 430F, 384F),
    new Line2D.Float( 167.698F, 304.233F, 167.698F, 269.349F),
    new Line2D.Float( 405.999F, 231.999F, 386F, 231.999F),
    new Line2D.Float( 405.999F, 245.999F, 368.999F, 245.999F),
    new Line2D.Float( 484.999F, 231.999F, 465F, 231.999F),
    new Line2D.Float( 484.999F, 245.999F, 447.999F, 245.999F),
    new Line2D.Float( 562.998F, 231.999F, 543F, 231.999F),
    new Line2D.Float( 562.998F, 245.999F, 525.999F, 245.999F),
    new Line2D.Float( 392.467F, 401.998F, 412.466F, 401.998F),
    new Line2D.Float( 392.467F, 415.999F, 429.467F, 415.999F),
    new Line2D.Float( 470.467F, 401.998F, 490.466F, 401.998F),
    new Line2D.Float( 470.467F, 415.999F, 507.467F, 415.999F),
    new Line2D.Float( 549.467F, 401.998F, 569.466F, 401.998F),
    new Line2D.Float( 549.467F, 415.999F, 586.466F, 415.999F),
    new Polygon( new int[] { 73, 73, 168, 168, 168, 73}, new int[] {290, 227, 227, 256, 227, 227}, 6),
    new Polygon( new int[] { 73, 76, 76, 73}, new int[] { 290, 286, 230,227}, 4),
    new Polygon( new int[] { 73, 76, 165, 168}, new int[] { 227, 230, 230,227}, 4),
    new Polygon( new int[] { 168, 165, 165, 168}, new int[] { 227, 230, 254,256}, 4),
    new Polygon( new int[] { 73, 73, 168, 168, 168, 73}, new int[] {412, 349, 349, 378, 349, 349}, 6),
    new Polygon( new int[] { 73, 76, 76, 73}, new int[] { 412, 408, 352,349}, 4),
    new Polygon( new int[] { 73, 76, 165, 168}, new int[] { 349, 352, 352,349}, 4),
    new Polygon( new int[] { 168, 165, 165, 168}, new int[] { 349, 352, 376,378}, 4),
    new Line2D.Float( 167.698F, 426.233F, 167.698F, 391.349F),
    new Line2D.Float( 132.814F, 427.325F, 132.814F, 392.441F),
    new Line2D.Float( 132.814F, 305.326F, 132.814F, 270.442F),
    new Line2D.Float( 590.999F, 281.999F, 590.999F, 156F),
    new Polygon( new int[] { 441, 591, 591, 591}, new int[] {142, 142, 148, 142}, 4),
    new Line2D.Float( 521.999F, 126F, 443.999F, 126F),
    new Polygon( new int[] { 411, 331, 331, 547, 547, 547, 331, 331}, new int[] {135, 135, 429, 429, 417, 429, 429, 135}, 8),
    new Polygon( new int[] { 411, 404, 342, 331}, new int[] { 135, 146, 146,135}, 4),
    new Polygon( new int[] { 331, 342, 342, 331}, new int[] { 135, 146, 418,429}, 4),
    new Polygon( new int[] { 331, 342, 536, 547}, new int[] { 429, 418, 418,429}, 4),
    new Polygon( new int[] { 547, 536, 536, 547}, new int[] { 429, 418, 420,417}, 4),
    new Polygon( new int[] { 331, 566, 566, 566}, new int[] {216, 216, 229, 216}, 4),
    new Polygon( new int[] { 331, 367, 565, 566}, new int[] { 216, 217, 217,216}, 4),
    new Polygon( new int[] { 566, 565, 565, 566}, new int[] { 216, 217, 228,229}, 4),
    new RoundRectangle2D.Float(537.558F, 396.729F, 17.9094F, 24.8695F, 5.37282F, 5.37282F),
    new Rectangle2D.Float(540.244F, 396.729F, 12.5366F, 1.79094F),
    new Rectangle2D.Float(537.558F, 399.415F, 1.79094F, 19.4967F),
    new Arc2D.Float(537.558F, 396.729F, 5.37282F, 5.37282F, 90F, 90F, Arc2D.PIE),
    new Arc2D.Float(550.094F, 396.729F, 5.37282F, 5.37282F, 45F, 45F, Arc2D.PIE),
    new Arc2D.Float(537.558F, 416.226F, 5.37282F, 5.37282F, 180F, 45F, Arc2D.PIE),
    new Rectangle2D.Float(540.244F, 419.807F, 12.5366F, 1.79094F),
    new Rectangle2D.Float(553.676F, 399.415F, 1.79094F, 19.4967F),
    new Arc2D.Float(550.094F, 416.226F, 5.37282F, 5.37282F, 270F, 90F, Arc2D.PIE),
    new Arc2D.Float(550.094F, 396.729F, 5.37282F, 5.37282F, 0F, 45F, Arc2D.PIE),
    new Arc2D.Float(537.558F, 416.226F, 5.37282F, 5.37282F, 225F, 45F, Arc2D.PIE),
    new RoundRectangle2D.Float(539.348F, 398.52F, 14.3275F, 21.2876F, 1.79094F, 1.79094F),
    new RoundRectangle2D.Float(537.558F, 396.729F, 17.9094F, 24.8695F, 5.37282F, 5.37282F),
    new Line2D.Float( 408.999F, 230F, 408.999F, 215.999F),
    new Line2D.Float( 487.999F, 230F, 487.999F, 215.999F),
    new Line2D.Float( 389.999F, 420.999F, 389.999F, 428.999F),
    new Line2D.Float( 467.999F, 420.999F, 467.999F, 428.999F),
    new RoundRectangle2D.Float(458.558F, 396.729F, 17.9094F, 24.8695F, 5.37282F, 5.37282F),
    new Rectangle2D.Float(461.244F, 396.729F, 12.5366F, 1.79094F),
    new Rectangle2D.Float(458.558F, 399.415F, 1.79094F, 19.4967F),
    new Arc2D.Float(458.558F, 396.729F, 5.37282F, 5.37282F, 90F, 90F, Arc2D.PIE),
    new Arc2D.Float(471.095F, 396.729F, 5.37282F, 5.37282F, 45F, 45F, Arc2D.PIE),
    new Arc2D.Float(458.558F, 416.226F, 5.37282F, 5.37282F, 180F, 45F, Arc2D.PIE),
    new Rectangle2D.Float(461.244F, 419.807F, 12.5366F, 1.79094F),
    new Rectangle2D.Float(474.677F, 399.415F, 1.79094F, 19.4967F),
    new Arc2D.Float(471.095F, 416.226F, 5.37282F, 5.37282F, 270F, 90F, Arc2D.PIE),
    new Arc2D.Float(471.095F, 396.729F, 5.37282F, 5.37282F, 0F, 45F, Arc2D.PIE),
    new Arc2D.Float(458.558F, 416.226F, 5.37282F, 5.37282F, 225F, 45F, Arc2D.PIE),
    new RoundRectangle2D.Float(460.349F, 398.52F, 14.3275F, 21.2876F, 1.79094F, 1.79094F),
    new RoundRectangle2D.Float(458.558F, 396.729F, 17.9094F, 24.8695F, 5.37282F, 5.37282F),
    new RoundRectangle2D.Float(380.558F, 396.729F, 17.9094F, 24.8695F, 5.37282F, 5.37282F),
    new Rectangle2D.Float(383.244F, 396.729F, 12.5366F, 1.79094F),
    new Rectangle2D.Float(380.558F, 399.415F, 1.79094F, 19.4967F),
    new Arc2D.Float(380.558F, 396.729F, 5.37282F, 5.37282F, 90F, 90F, Arc2D.PIE),
    new Arc2D.Float(393.095F, 396.729F, 5.37282F, 5.37282F, 45F, 45F, Arc2D.PIE),
    new Arc2D.Float(380.558F, 416.226F, 5.37282F, 5.37282F, 180F, 45F, Arc2D.PIE),
    new Rectangle2D.Float(383.244F, 419.807F, 12.5366F, 1.79094F),
    new Rectangle2D.Float(396.677F, 399.415F, 1.79094F, 19.4967F),
    new Arc2D.Float(393.095F, 416.226F, 5.37282F, 5.37282F, 270F, 90F, Arc2D.PIE),
    new Arc2D.Float(393.095F, 396.729F, 5.37282F, 5.37282F, 0F, 45F, Arc2D.PIE),
    new Arc2D.Float(380.558F, 416.226F, 5.37282F, 5.37282F, 225F, 45F, Arc2D.PIE),
    new RoundRectangle2D.Float(382.349F, 398.52F, 14.3275F, 21.2876F, 1.79094F, 1.79094F),
    new RoundRectangle2D.Float(380.558F, 396.729F, 17.9094F, 24.8695F, 5.37282F, 5.37282F),
    new RoundRectangle2D.Float(399.999F, 226.73F, 17.9094F, 24.8695F, 5.37282F, 5.37282F),
    new Rectangle2D.Float(402.685F, 226.73F, 12.5366F, 1.79094F),
    new Rectangle2D.Float(399.999F, 229.416F, 1.79094F, 19.4967F),
    new Arc2D.Float(399.999F, 226.73F, 5.37282F, 5.37282F, 90F, 90F, Arc2D.PIE),
    new Arc2D.Float(412.535F, 226.73F, 5.37282F, 5.37282F, 45F, 45F, Arc2D.PIE),
    new Arc2D.Float(399.999F, 246.227F, 5.37282F, 5.37282F, 180F, 45F, Arc2D.PIE),
    new Rectangle2D.Float(402.685F, 249.809F, 12.5366F, 1.79094F),
    new Rectangle2D.Float(416.117F, 229.416F, 1.79094F, 19.4967F),
    new Arc2D.Float(412.535F, 246.227F, 5.37282F, 5.37282F, 270F, 90F, Arc2D.PIE),
    new Arc2D.Float(412.535F, 226.73F, 5.37282F, 5.37282F, 0F, 45F, Arc2D.PIE),
    new Arc2D.Float(399.999F, 246.227F, 5.37282F, 5.37282F, 225F, 45F, Arc2D.PIE),
    new RoundRectangle2D.Float(401.79F, 228.521F, 14.3275F, 21.2876F, 1.79094F, 1.79094F),
    new RoundRectangle2D.Float(399.999F, 226.73F, 17.9094F, 24.8695F, 5.37282F, 5.37282F),
    new RoundRectangle2D.Float(478.998F, 226.73F, 17.9094F, 24.8695F, 5.37282F, 5.37282F),
    new Rectangle2D.Float(481.685F, 226.73F, 12.5366F, 1.79094F),
    new Rectangle2D.Float(478.998F, 229.416F, 1.79094F, 19.4967F),
    new Arc2D.Float(478.998F, 226.73F, 5.37282F, 5.37282F, 90F, 90F, Arc2D.PIE),
    new Arc2D.Float(491.535F, 226.73F, 5.37282F, 5.37282F, 45F, 45F, Arc2D.PIE),
    new Arc2D.Float(478.998F, 246.227F, 5.37282F, 5.37282F, 180F, 45F, Arc2D.PIE),
    new Rectangle2D.Float(481.685F, 249.809F, 12.5366F, 1.79094F),
    new Rectangle2D.Float(495.117F, 229.416F, 1.79094F, 19.4967F),
    new Arc2D.Float(491.535F, 246.227F, 5.37282F, 5.37282F, 270F, 90F, Arc2D.PIE),
    new Arc2D.Float(491.535F, 226.73F, 5.37282F, 5.37282F, 0F, 45F, Arc2D.PIE),
    new Arc2D.Float(478.998F, 246.227F, 5.37282F, 5.37282F, 225F, 45F, Arc2D.PIE),
    new RoundRectangle2D.Float(480.789F, 228.521F, 14.3275F, 21.2876F, 1.79094F, 1.79094F),
    new RoundRectangle2D.Float(478.998F, 226.73F, 17.9094F, 24.8695F, 5.37282F, 5.37282F),
    new RoundRectangle2D.Float(556.998F, 226.73F, 17.9094F, 24.8695F, 5.37282F, 5.37282F),
    new Rectangle2D.Float(559.685F, 226.73F, 12.5366F, 1.79094F),
    new Rectangle2D.Float(556.998F, 229.416F, 1.79094F, 19.4967F),
    new Arc2D.Float(556.998F, 226.73F, 5.37282F, 5.37282F, 90F, 90F, Arc2D.PIE),
    new Arc2D.Float(569.535F, 226.73F, 5.37282F, 5.37282F, 45F, 45F, Arc2D.PIE),
    new Arc2D.Float(556.998F, 246.227F, 5.37282F, 5.37282F, 180F, 45F, Arc2D.PIE),
    new Rectangle2D.Float(559.685F, 249.809F, 12.5366F, 1.79094F),
    new Rectangle2D.Float(573.117F, 229.416F, 1.79094F, 19.4967F),
    new Arc2D.Float(569.535F, 246.227F, 5.37282F, 5.37282F, 270F, 90F, Arc2D.PIE),
    new Arc2D.Float(569.535F, 226.73F, 5.37282F, 5.37282F, 0F, 45F, Arc2D.PIE),
    new Arc2D.Float(556.998F, 246.227F, 5.37282F, 5.37282F, 225F, 45F, Arc2D.PIE),
    new RoundRectangle2D.Float(558.789F, 228.521F, 14.3275F, 21.2876F, 1.79094F, 1.79094F),
    new RoundRectangle2D.Float(556.998F, 226.73F, 17.9094F, 24.8695F, 5.37282F, 5.37282F),
    new Rectangle2D.Float(342.116F, 263.628F, 270.288F, 120.023F),
    new Polygon( new int[] { 342, 612, 606, 348, 348, 342}, new int[] { 264, 264, 270, 270, 378, 384}, 6), 
    new Polygon( new int[] { 612, 612, 606, 606, 348, 342}, new int[] { 384, 264, 270, 378, 378, 384}, 6), 
    new Line2D.Float( 17F, 429F, 54F, 429F),
    new Line2D.Float( 17F, 427F, 54F, 427F),
    new Line2D.Float( 17F, 430F, 54F, 430F),
    new Line2D.Float( 17F, 426F, 54F, 426F),
    new Line2D.Float( 17F, 431F, 54F, 431F),
    new Line2D.Float( 279F, 429F, 89F, 429F),
    new Line2D.Float( 279F, 427F, 89F, 427F),
    new Line2D.Float( 279F, 430F, 89F, 430F),
    new Line2D.Float( 279F, 426F, 89F, 426F),
    new Line2D.Float( 279F, 431F, 89F, 431F),
    new Line2D.Float( 288F, 438F, 288F, 455F),
    new Line2D.Float( 297F, 464F, 421F, 464F),
    new Arc2D.Float(288F, 447F, 17F, 17F, 180F, 90F, Arc2D.OPEN),
    new Line2D.Float( 286F, 438F, 286F, 455F),
    new Line2D.Float( 289F, 438F, 289F, 455F),
    new Line2D.Float( 285F, 438F, 285F, 455F),
    new Line2D.Float( 290F, 438F, 290F, 455F),
    new Line2D.Float( 297F, 462F, 421F, 462F),
    new Line2D.Float( 297F, 465F, 421F, 465F),
    new Line2D.Float( 297F, 461F, 421F, 461F),
    new Line2D.Float( 297F, 466F, 421F, 466F),
    new Arc2D.Float(286F, 445F, 20F, 20F, 225F, 45F, Arc2D.OPEN),
    new Arc2D.Float(286F, 445F, 20F, 20F, 180F, 45F, Arc2D.OPEN),
    new Arc2D.Float(289F, 448F, 14F, 14F, 225F, 45F, Arc2D.OPEN),
    new Arc2D.Float(289F, 448F, 14F, 14F, 180F, 45F, Arc2D.OPEN),
    new Arc2D.Float(285F, 444F, 22F, 22F, 180F, 90F, Arc2D.OPEN),
    new Arc2D.Float(290F, 449F, 12F, 12F, 180F, 90F, Arc2D.OPEN),
    new Line2D.Float( 455F, 203F, 394F, 203F),
    new Line2D.Float( 455F, 201F, 394F, 201F),
    new Line2D.Float( 455F, 204F, 394F, 204F),
    new Line2D.Float( 455F, 200F, 394F, 200F),
    new Line2D.Float( 455F, 205F, 394F, 205F),
    new Line2D.Float( 534F, 203F, 473F, 203F),
    new Line2D.Float( 534F, 201F, 473F, 201F),
    new Line2D.Float( 534F, 204F, 473F, 204F),
    new Line2D.Float( 534F, 200F, 473F, 200F),
    new Line2D.Float( 534F, 205F, 473F, 205F),
    new Line2D.Float( 499F, 464F, 438F, 464F),
    new Line2D.Float( 499F, 462F, 438F, 462F),
    new Line2D.Float( 499F, 465F, 438F, 465F),
    new Line2D.Float( 499F, 461F, 438F, 461F),
    new Line2D.Float( 499F, 466F, 438F, 466F),
    new Line2D.Float( 578F, 464F, 517F, 464F),
    new Line2D.Float( 578F, 462F, 517F, 462F),
    new Line2D.Float( 578F, 465F, 517F, 465F),
    new Line2D.Float( 578F, 461F, 517F, 461F),
    new Line2D.Float( 578F, 466F, 517F, 466F),
    new Line2D.Float( 19F, 307F, 54F, 307F),
    new Line2D.Float( 19F, 305F, 54F, 305F),
    new Line2D.Float( 19F, 308F, 54F, 308F),
    new Line2D.Float( 19F, 304F, 54F, 304F),
    new Line2D.Float( 19F, 309F, 54F, 309F),
    new Line2D.Float( 438F, 176F, 377F, 176F),
    new Line2D.Float( 438F, 174F, 377F, 174F),
    new Line2D.Float( 438F, 177F, 377F, 177F),
    new Line2D.Float( 438F, 173F, 377F, 173F),
    new Line2D.Float( 438F, 178F, 377F, 178F),
    new Line2D.Float( 517F, 176F, 455F, 176F),
    new Line2D.Float( 517F, 174F, 455F, 174F),
    new Line2D.Float( 517F, 177F, 455F, 177F),
    new Line2D.Float( 517F, 173F, 455F, 173F),
    new Line2D.Float( 517F, 178F, 455F, 178F),
    new Line2D.Float( 316F, 316F, 316F, 429F),
    new Line2D.Float( 325F, 438F, 403F, 438F),
    new Arc2D.Float(316F, 421F, 17F, 17F, 180F, 90F, Arc2D.OPEN),
    new Line2D.Float( 314F, 316F, 314F, 429F),
    new Line2D.Float( 317F, 316F, 317F, 429F),
    new Line2D.Float( 313F, 316F, 313F, 429F),
    new Line2D.Float( 318F, 316F, 318F, 429F),
    new Line2D.Float( 325F, 436F, 403F, 436F),
    new Line2D.Float( 325F, 439F, 403F, 439F),
    new Line2D.Float( 325F, 435F, 403F, 435F),
    new Line2D.Float( 325F, 440F, 403F, 440F),
    new Arc2D.Float(314F, 419F, 20F, 20F, 225F, 45F, Arc2D.OPEN),
    new Arc2D.Float(314F, 419F, 20F, 20F, 180F, 45F, Arc2D.OPEN),
    new Arc2D.Float(317F, 422F, 14F, 14F, 225F, 45F, Arc2D.OPEN),
    new Arc2D.Float(317F, 422F, 14F, 14F, 180F, 45F, Arc2D.OPEN),
    new Arc2D.Float(313F, 418F, 22F, 22F, 180F, 90F, Arc2D.OPEN),
    new Arc2D.Float(318F, 423F, 12F, 12F, 180F, 90F, Arc2D.OPEN),
    new Line2D.Float( 482F, 438F, 421F, 438F),
    new Line2D.Float( 482F, 436F, 421F, 436F),
    new Line2D.Float( 482F, 439F, 421F, 439F),
    new Line2D.Float( 482F, 435F, 421F, 435F),
    new Line2D.Float( 482F, 440F, 421F, 440F),
    new Line2D.Float( 560F, 438F, 499F, 438F),
    new Line2D.Float( 560F, 436F, 499F, 436F),
    new Line2D.Float( 560F, 439F, 499F, 439F),
    new Line2D.Float( 560F, 435F, 499F, 435F),
    new Line2D.Float( 560F, 440F, 499F, 440F),
    new Line2D.Float( 307F, 307F, 229F, 307F),
    new Line2D.Float( 307F, 305F, 229F, 305F),
    new Line2D.Float( 307F, 308F, 229F, 308F),
    new Line2D.Float( 307F, 304F, 229F, 304F),
    new Line2D.Float( 307F, 309F, 229F, 309F),
    new Line2D.Float( 368F, 255F, 368F, 185F),
    new Line2D.Float( 368F, 255F, 368F, 185F),
    new Line2D.Float( 368F, 255F, 368F, 185F),
    new Line2D.Float( 367F, 255F, 367F, 185F),
    new Line2D.Float( 369F, 255F, 369F, 185F),
    new Line2D.Float( 447F, 255F, 447F, 185F),
    new Line2D.Float( 447F, 255F, 447F, 185F),
    new Line2D.Float( 447F, 255F, 447F, 185F),
    new Line2D.Float( 446F, 255F, 446F, 185F),
    new Line2D.Float( 448F, 255F, 448F, 185F),
    new Line2D.Float( 525F, 255F, 525F, 185F),
    new Line2D.Float( 525F, 255F, 525F, 185F),
    new Line2D.Float( 525F, 255F, 525F, 185F),
    new Line2D.Float( 524F, 255F, 524F, 185F),
    new Line2D.Float( 526F, 255F, 526F, 185F),
    new Line2D.Float( 386F, 255F, 386F, 211F),
    new Line2D.Float( 386F, 255F, 386F, 211F),
    new Line2D.Float( 386F, 255F, 386F, 211F),
    new Line2D.Float( 385F, 255F, 385F, 211F),
    new Line2D.Float( 387F, 255F, 387F, 211F),
    new Line2D.Float( 464F, 255F, 464F, 211F),
    new Line2D.Float( 464F, 255F, 464F, 211F),
    new Line2D.Float( 464F, 255F, 464F, 211F),
    new Line2D.Float( 463F, 255F, 463F, 211F),
    new Line2D.Float( 465F, 255F, 465F, 211F),
    new Line2D.Float( 543F, 255F, 543F, 211F),
    new Line2D.Float( 543F, 255F, 543F, 211F),
    new Line2D.Float( 543F, 255F, 543F, 211F),
    new Line2D.Float( 542F, 255F, 542F, 211F),
    new Line2D.Float( 544F, 255F, 544F, 211F),
    new Line2D.Float( 412F, 386F, 412F, 429F),
    new Line2D.Float( 412F, 386F, 412F, 429F),
    new Line2D.Float( 412F, 386F, 412F, 429F),
    new Line2D.Float( 411F, 386F, 411F, 429F),
    new Line2D.Float( 413F, 386F, 413F, 429F),
    new Line2D.Float( 490F, 386F, 490F, 429F),
    new Line2D.Float( 490F, 386F, 490F, 429F),
    new Line2D.Float( 490F, 386F, 490F, 429F),
    new Line2D.Float( 489F, 386F, 489F, 429F),
    new Line2D.Float( 491F, 386F, 491F, 429F),
    new Line2D.Float( 569F, 386F, 569F, 429F),
    new Line2D.Float( 569F, 386F, 569F, 429F),
    new Line2D.Float( 569F, 386F, 569F, 429F),
    new Line2D.Float( 568F, 386F, 568F, 429F),
    new Line2D.Float( 570F, 386F, 570F, 429F),
    new Line2D.Float( 429F, 393F, 429F, 455F),
    new Line2D.Float( 429F, 393F, 429F, 455F),
    new Line2D.Float( 429F, 393F, 429F, 455F),
    new Line2D.Float( 428F, 393F, 428F, 455F),
    new Line2D.Float( 430F, 393F, 430F, 455F),
    new Line2D.Float( 508F, 386F, 508F, 455F),
    new Line2D.Float( 508F, 386F, 508F, 455F),
    new Line2D.Float( 508F, 386F, 508F, 455F),
    new Line2D.Float( 507F, 386F, 507F, 455F),
    new Line2D.Float( 509F, 386F, 509F, 455F),
    new Line2D.Float( 586F, 386F, 586F, 455F),
    new Line2D.Float( 586F, 386F, 586F, 455F),
    new Line2D.Float( 586F, 386F, 586F, 455F),
    new Line2D.Float( 585F, 386F, 585F, 455F),
    new Line2D.Float( 587F, 386F, 587F, 455F),
    new Line2D.Float( 194F, 307F, 89F, 307F),
    new Line2D.Float( 194F, 305F, 89F, 305F),
    new Line2D.Float( 194F, 308F, 89F, 308F),
    new Line2D.Float( 194F, 304F, 89F, 304F),
    new Line2D.Float( 194F, 309F, 89F, 309F),
    new Line2D.Float( 377F, 203F, 297F, 203F),
    new Line2D.Float( 288F, 211F, 288F, 421F),
    new Arc2D.Float(288F, 203F, 17F, 17F, 90F, 90F, Arc2D.OPEN),
    new Line2D.Float( 377F, 201F, 297F, 201F),
    new Line2D.Float( 377F, 204F, 297F, 204F),
    new Line2D.Float( 377F, 200F, 297F, 200F),
    new Line2D.Float( 377F, 205F, 297F, 205F),
    new Line2D.Float( 286F, 211F, 286F, 421F),
    new Line2D.Float( 289F, 211F, 289F, 421F),
    new Line2D.Float( 285F, 211F, 285F, 421F),
    new Line2D.Float( 290F, 211F, 290F, 421F),
    new Arc2D.Float(286F, 201F, 20F, 20F, 90F, 90F, Arc2D.OPEN),
    new Arc2D.Float(289F, 204F, 14F, 14F, 90F, 90F, Arc2D.OPEN),
    new Arc2D.Float(285F, 200F, 22F, 22F, 90F, 90F, Arc2D.OPEN),
    new Arc2D.Float(290F, 205F, 12F, 12F, 90F, 90F, Arc2D.OPEN),
    new Line2D.Float( 316F, 299F, 316F, 185F),
    new Line2D.Float( 325F, 176F, 360F, 176F),
    new Arc2D.Float(316F, 176F, 17F, 18F, 90F, 90F, Arc2D.OPEN),
    new Line2D.Float( 314F, 299F, 314F, 185F),
    new Line2D.Float( 317F, 299F, 317F, 185F),
    new Line2D.Float( 313F, 299F, 313F, 185F),
    new Line2D.Float( 318F, 299F, 318F, 185F),
    new Line2D.Float( 325F, 174F, 360F, 174F),
    new Line2D.Float( 325F, 177F, 360F, 177F),
    new Line2D.Float( 325F, 173F, 360F, 173F),
    new Line2D.Float( 325F, 178F, 360F, 178F),
    new Arc2D.Float(314F, 174F, 20F, 21F, 90F, 90F, Arc2D.OPEN),
    new Arc2D.Float(317F, 177F, 14F, 15F, 90F, 90F, Arc2D.OPEN),
    new Arc2D.Float(313F, 173F, 22F, 23F, 90F, 90F, Arc2D.OPEN),
    new Arc2D.Float(318F, 178F, 12F, 13F, 90F, 90F, Arc2D.OPEN),
  };
  public void paint(Graphics g1) {
    Graphics2D g = (Graphics2D) g1;
    Component c;
    Point p;
    paintComponent(g);
    for ( int i = 0; i < getComponentCount(); i++) {
      AffineTransform save = g.getTransform();
      c = getComponent(i);
      p = c.getLocation();
      g.translate((int)p.getX(), (int)p.getY());
      c.paint(g);
      g.setTransform(save);
    }
  }
  public void paintComponent(Graphics g1) {
    Graphics2D g = (Graphics2D) g1;
    float width = getWidth();
    float height = getHeight();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    double scaleWidth =  (1.0*width/original_width);
    double scaleHeight = (1.0*height/original_height);
    AffineTransform save = g.getTransform();
    g.setColor(getBackground());
    g.fill(new Rectangle(0,0,getWidth(),getHeight()));
    g.transform( AffineTransform.getScaleInstance( scaleWidth, scaleHeight)); // scaletest
    AffineTransform save_tmp;
    {
    int fcolor = GeColor.getDrawtype(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[0]);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[1]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[2]);
    }
    }
    {
    int fcolor = GeColor.getDrawtype(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[3]);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[4]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[5]);
    }
    }
    {
    int fcolor = GeColor.getDrawtype(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[7]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[8]);
    }
    {
    int fcolor = GeColor.getDrawtype(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[10]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[11]);
    }
    {
    int fcolor = GeColor.getDrawtype(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[13]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[14]);
    }
    {
    int fcolor = GeColor.getDrawtype(212, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[15]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(214, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[16]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(214, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[17]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(210, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[18]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[19]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[20]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[21]);
    {
    int fcolor = GeColor.getDrawtype(212, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[22]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(214, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[23]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(214, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[24]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(210, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[25]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[26]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[27]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[28]);
    {
    int fcolor = GeColor.getDrawtype(212, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[29]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(214, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[30]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(214, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[31]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(210, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[32]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[33]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[34]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[35]);
    {
    int fcolor = GeColor.getDrawtype(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[36]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[37]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[38]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[39]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[40]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[41]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[42]);
    {
    int fcolor = GeColor.getDrawtype(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[43]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[44]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[45]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[46]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[47]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[48]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[49]);
    {
    int fcolor = GeColor.getDrawtype(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[50]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[51]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[52]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[53]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[54]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[55]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[56]);
    {
    int fcolor = GeColor.getDrawtype(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[57]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[58]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[59]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[60]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[61]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[62]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[63]);
    {
    int fcolor = GeColor.getDrawtype(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[64]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[65]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[66]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[67]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[68]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[69]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[70]);
    {
    int fcolor = GeColor.getDrawtype(133, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[71]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(135, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[72]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(131, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[73]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(131, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[74]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[75]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[76]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[77]);
    {
    int fcolor = GeColor.getDrawtype(133, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[78]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(135, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[79]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(131, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[80]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(131, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[81]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[82]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[83]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[84]);
    {
    int fcolor = GeColor.getDrawtype(133, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[85]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(135, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[86]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(131, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[87]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(131, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[88]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[89]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[90]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[91]);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.BOLD, 12));
    g.drawString( "Process",9, 16);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.BOLD, 18));
    g.drawString( "TemperatureControl",8, 43);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[92]);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "SetValue",465, 121);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "C",577, 126);
    {
    int fcolor = GeColor.getDrawtype(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[93]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[94]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[95]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[96]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[97]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[98]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[99]);
    {
    int fcolor = GeColor.getDrawtype(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[100]);
    }
    {
    int fcolor = GeColor.getDrawtype(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[101]);
    }
    {
    int fcolor = GeColor.getDrawtype(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[102]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[103]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[104]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[105]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[106]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[107]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[108]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[109]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[110]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[111]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[112]);
    {
    int fcolor = GeColor.getDrawtype(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[113]);
    }
    {
    int fcolor = GeColor.getDrawtype(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[114]);
    }
    {
    int fcolor = GeColor.getDrawtype(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[115]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[116]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[117]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[118]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[119]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[120]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[121]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[122]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[123]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[124]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[125]);
    {
    int fcolor = GeColor.getDrawtype(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[126]);
    }
    {
    int fcolor = GeColor.getDrawtype(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[127]);
    }
    {
    int fcolor = GeColor.getDrawtype(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[128]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[129]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[130]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[131]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[132]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[133]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[134]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[135]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[136]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[137]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[138]);
    {
    int fcolor = GeColor.getDrawtype(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[139]);
    }
    {
    int fcolor = GeColor.getDrawtype(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[140]);
    }
    {
    int fcolor = GeColor.getDrawtype(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[141]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[142]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[143]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[144]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[145]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[146]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[147]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[148]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[149]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[150]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[151]);
    {
    int fcolor = GeColor.getDrawtype(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[152]);
    }
    {
    int fcolor = GeColor.getDrawtype(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[153]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[154]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[155]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[156]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[157]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[158]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[159]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[160]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[161]);
    {
    int fcolor = GeColor.getDrawtype(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[162]);
    }
    {
    int fcolor = GeColor.getDrawtype(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[163]);
    }
    {
    int fcolor = GeColor.getDrawtype(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[164]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[165]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[166]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[167]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[168]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[169]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[170]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[171]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[172]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[173]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[174]);
    {
    int fcolor = GeColor.getDrawtype(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[175]);
    }
    {
    int fcolor = GeColor.getDrawtype(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[176]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[177]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[178]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[179]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[180]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[181]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[182]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[183]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[184]);
    {
    int fcolor = GeColor.getDrawtype(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[185]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[186]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[187]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[188]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[189]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[190]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[191]);
    {
    int fcolor = GeColor.getDrawtype(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[192]);
    }
    {
    int fcolor = GeColor.getDrawtype(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[193]);
    }
    {
    int fcolor = GeColor.getDrawtype(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[194]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[195]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[196]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[197]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[198]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[199]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[200]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[201]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[202]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[203]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[204]);
    {
    int fcolor = GeColor.getDrawtype(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[205]);
    }
    {
    int fcolor = GeColor.getDrawtype(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[206]);
    }
    {
    int fcolor = GeColor.getDrawtype(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[207]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[208]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[209]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[210]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[211]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[212]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[213]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[214]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[215]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[216]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[217]);
    {
    int fcolor = GeColor.getDrawtype(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[218]);
    }
    {
    int fcolor = GeColor.getDrawtype(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[219]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[220]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[221]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[222]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[223]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[224]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[225]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[226]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[227]);
    {
    int fcolor = GeColor.getDrawtype(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[228]);
    }
    {
    int fcolor = GeColor.getDrawtype(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[229]);
    }
    {
    int fcolor = GeColor.getDrawtype(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[230]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[231]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[232]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[233]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[234]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[235]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[236]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[237]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[238]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[239]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[240]);
    {
    int fcolor = GeColor.getDrawtype(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[241]);
    }
    {
    int fcolor = GeColor.getDrawtype(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[242]);
    }
    {
    int fcolor = GeColor.getDrawtype(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[243]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[244]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[245]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[246]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[247]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[248]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[249]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[250]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[251]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[252]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[253]);
    {
    int fcolor = GeColor.getDrawtype(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[254]);
    }
    {
    int fcolor = GeColor.getDrawtype(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[255]);
    }
    {
    int fcolor = GeColor.getDrawtype(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[256]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[257]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[258]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[259]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[260]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[261]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[262]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[263]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[264]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[265]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[266]);
    {
    int fcolor = GeColor.getDrawtype(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[267]);
    }
    {
    int fcolor = GeColor.getDrawtype(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[268]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[269]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[270]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[271]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[272]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[273]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[274]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[275]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[276]);
    {
    int fcolor = GeColor.getDrawtype(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[277]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[278]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[279]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[280]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[281]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[282]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[283]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[284]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[285]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[286]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[287]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[288]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[289]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[290]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[291]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[292]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[293]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[294]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[295]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[296]);
    {
    int fcolor = GeColor.getDrawtype(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[298]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[299]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[300]);
    }
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(37, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[297]);
    {
    int fcolor = GeColor.getDrawtype(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[302]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[303]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[304]);
    }
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(37, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[301]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[305]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[306]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[307]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[308]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[309]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[310]);
    {
    int fcolor = GeColor.getDrawtype(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[312]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[313]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[314]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[315]);
    }
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[311]);
    {
    int fcolor = GeColor.getDrawtype(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[317]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[318]);
    }
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[316]);
    {
    int fcolor = GeColor.getDrawtype(58, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[324]);
    g.fill( shapes[323]);
    g.fill( shapes[322]);
    g.fill( shapes[321]);
    g.fill( shapes[320]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[329]);
    g.fill( shapes[328]);
    g.fill( shapes[327]);
    g.fill( shapes[326]);
    g.fill( shapes[325]);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[330]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[331]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[332]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[333]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[334]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[335]);
    {
    int fcolor = GeColor.getDrawtype(58, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[341]);
    g.fill( shapes[340]);
    g.fill( shapes[339]);
    g.fill( shapes[338]);
    g.fill( shapes[337]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[346]);
    g.fill( shapes[345]);
    g.fill( shapes[344]);
    g.fill( shapes[343]);
    g.fill( shapes[342]);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[347]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[348]);
    {
    int fcolor = GeColor.getDrawtype(58, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[354]);
    g.fill( shapes[353]);
    g.fill( shapes[352]);
    g.fill( shapes[351]);
    g.fill( shapes[350]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[359]);
    g.fill( shapes[358]);
    g.fill( shapes[357]);
    g.fill( shapes[356]);
    g.fill( shapes[355]);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[360]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[361]);
    {
    int fcolor = GeColor.getDrawtype(58, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[367]);
    g.fill( shapes[366]);
    g.fill( shapes[365]);
    g.fill( shapes[364]);
    g.fill( shapes[363]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[372]);
    g.fill( shapes[371]);
    g.fill( shapes[370]);
    g.fill( shapes[369]);
    g.fill( shapes[368]);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[373]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[374]);
    {
    int fcolor = GeColor.getDrawtype(58, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[380]);
    g.fill( shapes[379]);
    g.fill( shapes[378]);
    g.fill( shapes[377]);
    g.fill( shapes[376]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[385]);
    g.fill( shapes[384]);
    g.fill( shapes[383]);
    g.fill( shapes[382]);
    g.fill( shapes[381]);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[386]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[387]);
    {
    int fcolor = GeColor.getDrawtype(58, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[393]);
    g.fill( shapes[392]);
    g.fill( shapes[391]);
    g.fill( shapes[390]);
    g.fill( shapes[389]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[398]);
    g.fill( shapes[397]);
    g.fill( shapes[396]);
    g.fill( shapes[395]);
    g.fill( shapes[394]);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[399]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[400]);
    {
    int fcolor = GeColor.getDrawtype(39, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[401]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[402]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[403]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[401]);
    }
    g.setStroke( new BasicStroke(6F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[404]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[405]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[406]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[407]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[408]);
    g.setStroke( new BasicStroke(6F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[409]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[410]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[411]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[412]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[413]);
    g.setStroke( new BasicStroke(6F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[414]);
    g.setStroke( new BasicStroke(6F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[415]);
    g.setStroke( new BasicStroke(6F));
    g.setColor(GeColor.getColor(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[416]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[417]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[418]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[419]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[420]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[421]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[422]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[423]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[424]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[425]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[426]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[427]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[428]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[429]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[430]);
    g.setStroke( new BasicStroke(6F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[431]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[432]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[433]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[434]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[435]);
    g.setStroke( new BasicStroke(6F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[436]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[437]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[438]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[439]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[440]);
    g.setStroke( new BasicStroke(6F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[441]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[442]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[443]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[444]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[445]);
    g.setStroke( new BasicStroke(6F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[446]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[447]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[448]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[449]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[450]);
    g.setStroke( new BasicStroke(6F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[451]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[452]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[453]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[454]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[455]);
    g.setStroke( new BasicStroke(6F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[456]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[457]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[458]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[459]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[460]);
    g.setStroke( new BasicStroke(6F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[461]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[462]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[463]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[464]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[465]);
    g.setStroke( new BasicStroke(6F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[466]);
    g.setStroke( new BasicStroke(6F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[467]);
    g.setStroke( new BasicStroke(6F));
    g.setColor(GeColor.getColor(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[468]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[469]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[470]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[471]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[472]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[473]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[474]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[475]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[476]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[477]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[478]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[479]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[480]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[481]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[482]);
    g.setStroke( new BasicStroke(6F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[483]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[484]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[485]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[486]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[487]);
    g.setStroke( new BasicStroke(6F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[488]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[489]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[490]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[491]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[492]);
    g.setStroke( new BasicStroke(6F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[493]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[494]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[495]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[496]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[497]);
    g.setStroke( new BasicStroke(3F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[498]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[499]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[500]);
    paintComponent0( g, save);
  }
  void paintComponent0( Graphics2D g, AffineTransform save) {
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[501]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[502]);
    g.setStroke( new BasicStroke(3F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[503]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[504]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[505]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[506]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[507]);
    g.setStroke( new BasicStroke(3F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[508]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[509]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[510]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[511]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[512]);
    g.setStroke( new BasicStroke(3F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(212, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[513]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(210, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[514]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(214, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[515]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[516]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[517]);
    g.setStroke( new BasicStroke(3F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(212, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[518]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(210, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[519]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(214, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[520]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[521]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[522]);
    g.setStroke( new BasicStroke(3F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(212, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[523]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(210, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[524]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(214, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[525]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[526]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[527]);
    g.setStroke( new BasicStroke(3F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(133, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[528]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(131, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[529]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(135, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[530]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[531]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[532]);
    g.setStroke( new BasicStroke(3F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(133, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[533]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(131, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[534]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(135, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[535]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[536]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[537]);
    g.setStroke( new BasicStroke(3F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(133, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[538]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(131, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[539]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(135, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[540]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[541]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[542]);
    g.setStroke( new BasicStroke(3F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[543]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[544]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[545]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[546]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[547]);
    g.setStroke( new BasicStroke(3F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[548]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[549]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[550]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[551]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[552]);
    g.setStroke( new BasicStroke(3F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[553]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[554]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[555]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[556]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[557]);
    g.setStroke( new BasicStroke(6F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[558]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[559]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[560]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[561]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[562]);
    g.setStroke( new BasicStroke(6F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[563]);
    g.setStroke( new BasicStroke(6F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[564]);
    g.setStroke( new BasicStroke(6F));
    g.setColor(GeColor.getColor(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[565]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[566]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[567]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[568]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[569]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[570]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[571]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[572]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[573]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(211, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[574]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(215, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[575]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[576]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[577]);
    g.setStroke( new BasicStroke(6F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[578]);
    g.setStroke( new BasicStroke(6F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[579]);
    g.setStroke( new BasicStroke(6F));
    g.setColor(GeColor.getColor(134, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[580]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[581]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[582]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[583]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[584]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[585]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[586]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[587]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[588]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(132, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[589]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(136, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[590]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[591]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[592]);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class pwr_sliderbackground3 extends GeComponent {
  // Dimension size;
  public pwr_sliderbackground3( JopSession session)
  {
    super( session);
    size = new Dimension( 56, 213);
  }
  public int original_width = 56;
  public int original_height = 213;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 52.3256F, 209.302F),
    new Polygon( new int[] { 2, 54, 53, 3, 3, 2}, new int[] { 2, 2, 3, 3, 210, 211}, 6), 
    new Polygon( new int[] { 54, 54, 53, 53, 3, 2}, new int[] { 211, 2, 3, 210, 210, 211}, 6), 
  };
  public void paintComponent(Graphics g1) {
    animationCount = 1;
    if ( !visible)
      return;
    Graphics2D g = (Graphics2D) g1;
    float width = getWidth();
    float height = getHeight();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    if ( 45.0 <= rotate && rotate < 135.0) {
      g.translate( width, 0.0); 
      g.rotate( Math.PI * rotate/180, 0.0, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else if ( 135.0 <= rotate && rotate < 225.0)
    {
      g.rotate( Math.PI * rotate/180, width/2, height/2);
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    }
    else if ( 225.0 <= rotate && rotate < 315.0)
    {
      g.translate( -height, 0.0);
      g.rotate( Math.PI * rotate/180, height, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    if ( (dd.dynType & GeDyn.mDynType_Rotate) != 0 && dd.rotate != 0) {
      g.rotate( Math.PI * dd.rotate/180, 

           (dd.x0 - getX())*original_width/width,
           (dd.y0 - getY()) * original_height / height);
    }
    AffineTransform save = g.getTransform();
    AffineTransform save_tmp;
    int rounds = 1;
    if ( fillLevel != 1F)
      rounds = 2;
    int oldColor = 0;
    for ( int i = 0; i < rounds; i++) {
      if ( rounds == 2) {
        switch ( i) {
        case 0:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO) {
	    oldColor = colorTone;
	    colorTone = levelColorTone;
	  }
	  else if ( levelFillColor != GeColor.COLOR_NO) {
	    oldColor = fillColor;
	    fillColor = levelFillColor;
	  }
	  break;
        case 1:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO)
	    colorTone = oldColor;
	  else if ( levelFillColor != GeColor.COLOR_NO)
	    fillColor = oldColor;
	  break;
        }
        switch ( levelDirection) {
        case Ge.DIRECTION_UP:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,fillLevel*original_height+Ge.cJBean_Offset,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,fillLevel * original_height+Ge.cJBean_Offset));
	  break;
	case Ge.DIRECTION_DOWN:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,(1-fillLevel)*original_height+Ge.cJBean_Offset));
	  else
	    g.setClip(new Rectangle2D.Float(0F,(1-fillLevel)*original_height+Ge.cJBean_Offset,original_width,original_height));
	  break;
	case Ge.DIRECTION_RIGHT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(fillLevel*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,fillLevel*width+Ge.cJBean_Offset,height));
	  break;
	case Ge.DIRECTION_LEFT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,(1-fillLevel)*original_width+Ge.cJBean_Offset,original_height));
	  else
	    g.setClip(new Rectangle2D.Float((1-fillLevel)*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  break;
	}
      }
    {
    int fcolor = GeColor.getDrawtype(35, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[0]);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[1]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[2]);
    }
    }
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class pwr_slider3 extends GeComponent {
  // Dimension size;
  public pwr_slider3( JopSession session)
  {
    super( session);
    size = new Dimension( 56, 12);
  }
  public int original_width = 56;
  public int original_height = 12;
  Shape[] shapes = new Shape[] { 
    new Line2D.Float( 54.3256F, 6.36047F, 2F, 6.36047F),
    new Rectangle2D.Float(43.8605F, 2.87209F, 6.97674F, 6.97674F),
    new Polygon( new int[] { 44, 51, 50, 44, 44, 44}, new int[] { 3, 3, 3, 3, 10, 10}, 6), 
    new Polygon( new int[] { 51, 51, 50, 50, 44, 44}, new int[] { 10, 3, 3, 10, 10, 10}, 6), 
    new Polygon( new int[] { 44, 51, 51, 44, 44, 43, 43, 52, 52, 43, 43}, new int[] {3, 3, 10, 10, 3, 3, 11, 11, 2, 2, 3}, 11),
    new Rectangle2D.Float(43.8605F, 5.48837F, 6.97674F, 0.872093F),
    new Polygon( new int[] { 44, 51, 51, 44, 44, 44}, new int[] { 5, 5, 6, 6, 6, 6}, 6), 
    new Polygon( new int[] { 51, 51, 51, 51, 44, 44}, new int[] { 6, 5, 6, 6, 6, 6}, 6), 
    new Rectangle2D.Float(43.8605F, 6.36047F, 6.97674F, 0.872093F),
    new Polygon( new int[] { 44, 51, 51, 44, 44, 44}, new int[] { 6, 6, 6, 6, 7, 7}, 6), 
    new Polygon( new int[] { 51, 51, 51, 51, 44, 44}, new int[] { 7, 6, 6, 7, 7, 7}, 6), 
  };
  public void paintComponent(Graphics g1) {
    animationCount = 1;
    if ( !visible)
      return;
    Graphics2D g = (Graphics2D) g1;
    float width = getWidth();
    float height = getHeight();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    if ( 45.0 <= rotate && rotate < 135.0) {
      g.translate( width, 0.0); 
      g.rotate( Math.PI * rotate/180, 0.0, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else if ( 135.0 <= rotate && rotate < 225.0)
    {
      g.rotate( Math.PI * rotate/180, width/2, height/2);
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    }
    else if ( 225.0 <= rotate && rotate < 315.0)
    {
      g.translate( -height, 0.0);
      g.rotate( Math.PI * rotate/180, height, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    if ( (dd.dynType & GeDyn.mDynType_Rotate) != 0 && dd.rotate != 0) {
      g.rotate( Math.PI * dd.rotate/180, 

           (dd.x0 - getX())*original_width/width,
           (dd.y0 - getY()) * original_height / height);
    }
    AffineTransform save = g.getTransform();
    AffineTransform save_tmp;
    int rounds = 1;
    if ( fillLevel != 1F)
      rounds = 2;
    int oldColor = 0;
    for ( int i = 0; i < rounds; i++) {
      if ( rounds == 2) {
        switch ( i) {
        case 0:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO) {
	    oldColor = colorTone;
	    colorTone = levelColorTone;
	  }
	  else if ( levelFillColor != GeColor.COLOR_NO) {
	    oldColor = fillColor;
	    fillColor = levelFillColor;
	  }
	  break;
        case 1:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO)
	    colorTone = oldColor;
	  else if ( levelFillColor != GeColor.COLOR_NO)
	    fillColor = oldColor;
	  break;
        }
        switch ( levelDirection) {
        case Ge.DIRECTION_UP:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,fillLevel*original_height+Ge.cJBean_Offset,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,fillLevel * original_height+Ge.cJBean_Offset));
	  break;
	case Ge.DIRECTION_DOWN:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,(1-fillLevel)*original_height+Ge.cJBean_Offset));
	  else
	    g.setClip(new Rectangle2D.Float(0F,(1-fillLevel)*original_height+Ge.cJBean_Offset,original_width,original_height));
	  break;
	case Ge.DIRECTION_RIGHT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(fillLevel*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,fillLevel*width+Ge.cJBean_Offset,height));
	  break;
	case Ge.DIRECTION_LEFT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,(1-fillLevel)*original_width+Ge.cJBean_Offset,original_height));
	  else
	    g.setClip(new Rectangle2D.Float((1-fillLevel)*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  break;
	}
      }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[0]);
    {
    int fcolor = GeColor.getDrawtype(23, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[1]);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[2]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[3]);
    }
    }
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[4]);
    {
    int fcolor = GeColor.getDrawtype(27, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[5]);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[6]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[7]);
    }
    }
    {
    int fcolor = GeColor.getDrawtype(20, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[8]);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[9]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[10]);
    }
    }
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class pwr_conglue extends GeComponent {
  // Dimension size;
  public pwr_conglue( JopSession session)
  {
    super( session);
    size = new Dimension( 21, 21);
  }
  public int original_width = 21;
  public int original_height = 21;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 17.4419F, 17.4419F),
    new Polygon( new int[] { 2, 19, 19, 3, 3, 2}, new int[] { 2, 2, 3, 3, 19, 19}, 6), 
    new Polygon( new int[] { 19, 19, 19, 19, 3, 2}, new int[] { 19, 2, 3, 19, 19, 19}, 6), 
  };
  public void paintComponent(Graphics g1) {
    animationCount = 1;
    if ( !visible)
      return;
    Graphics2D g = (Graphics2D) g1;
    float width = getWidth();
    float height = getHeight();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    if ( 45.0 <= rotate && rotate < 135.0) {
      g.translate( width, 0.0); 
      g.rotate( Math.PI * rotate/180, 0.0, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else if ( 135.0 <= rotate && rotate < 225.0)
    {
      g.rotate( Math.PI * rotate/180, width/2, height/2);
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    }
    else if ( 225.0 <= rotate && rotate < 315.0)
    {
      g.translate( -height, 0.0);
      g.rotate( Math.PI * rotate/180, height, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    if ( (dd.dynType & GeDyn.mDynType_Rotate) != 0 && dd.rotate != 0) {
      g.rotate( Math.PI * dd.rotate/180, 

           (dd.x0 - getX())*original_width/width,
           (dd.y0 - getY()) * original_height / height);
    }
    AffineTransform save = g.getTransform();
    AffineTransform save_tmp;
    int rounds = 1;
    if ( fillLevel != 1F)
      rounds = 2;
    int oldColor = 0;
    for ( int i = 0; i < rounds; i++) {
      if ( rounds == 2) {
        switch ( i) {
        case 0:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO) {
	    oldColor = colorTone;
	    colorTone = levelColorTone;
	  }
	  else if ( levelFillColor != GeColor.COLOR_NO) {
	    oldColor = fillColor;
	    fillColor = levelFillColor;
	  }
	  break;
        case 1:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO)
	    colorTone = oldColor;
	  else if ( levelFillColor != GeColor.COLOR_NO)
	    fillColor = oldColor;
	  break;
        }
        switch ( levelDirection) {
        case Ge.DIRECTION_UP:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,fillLevel*original_height+Ge.cJBean_Offset,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,fillLevel * original_height+Ge.cJBean_Offset));
	  break;
	case Ge.DIRECTION_DOWN:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,(1-fillLevel)*original_height+Ge.cJBean_Offset));
	  else
	    g.setClip(new Rectangle2D.Float(0F,(1-fillLevel)*original_height+Ge.cJBean_Offset,original_width,original_height));
	  break;
	case Ge.DIRECTION_RIGHT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(fillLevel*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,fillLevel*width+Ge.cJBean_Offset,height));
	  break;
	case Ge.DIRECTION_LEFT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,(1-fillLevel)*original_width+Ge.cJBean_Offset,original_height));
	  else
	    g.setClip(new Rectangle2D.Float((1-fillLevel)*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  break;
	}
      }
    {
    int fcolor = GeColor.getDrawtype(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[1]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[2]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[0]);
    }
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class pwr_logga extends GeComponent {
  // Dimension size;
  public pwr_logga( JopSession session)
  {
    super( session);
    size = new Dimension( 91, 63);
  }
  public int original_width = 91;
  public int original_height = 63;
  Shape[] shapes = new Shape[] { 
    new Polygon( new int[] { 2, 2, 14, 11, 19, 72, 80, 77, 89, 89}, new int[] {61, 53, 35, 26, 9, 9, 26, 37, 53, 61}, 10),
    new Polygon( new int[] { 2, 6, 6, 2}, new int[] { 61, 57, 54,53}, 4),
    new Polygon( new int[] { 2, 6, 18, 14}, new int[] { 53, 54, 36,35}, 4),
    new Polygon( new int[] { 14, 18, 15, 11}, new int[] { 35, 36, 26,26}, 4),
    new Polygon( new int[] { 11, 15, 22, 19}, new int[] { 26, 26, 13,9}, 4),
    new Polygon( new int[] { 19, 22, 69, 72}, new int[] { 9, 13, 13,9}, 4),
    new Polygon( new int[] { 72, 69, 76, 80}, new int[] { 9, 13, 26,26}, 4),
    new Polygon( new int[] { 80, 76, 73, 77}, new int[] { 26, 26, 38,37}, 4),
    new Polygon( new int[] { 77, 73, 85, 89}, new int[] { 37, 38, 54,53}, 4),
    new Polygon( new int[] { 89, 85, 85, 89}, new int[] { 53, 54, 57,61}, 4),
    new Arc2D.Float(22.9302F, 12.4651F, 17.4419F, 17.4419F, 0F, 360F, Arc2D.PIE),
    new Arc2D.Float(22.9302F, 12.4651F, 17.4419F, 17.4419F, 35F, 140F, Arc2D.PIE),
    new Arc2D.Float(22.9302F, 12.4651F, 17.4419F, 17.4419F, 215F, 140F, Arc2D.PIE),
    new Arc2D.Float(22.9302F, 12.4651F, 17.4419F, 17.4419F, -5F, 40F, Arc2D.PIE),
    new Arc2D.Float(22.9302F, 12.4651F, 17.4419F, 17.4419F, 175F, 40F, Arc2D.PIE),
    new Arc2D.Float(23.8023F, 13.3372F, 15.6977F, 15.6977F, 0F, 360F, Arc2D.PIE),
    new Arc2D.Float(22.9302F, 12.4651F, 17.4419F, 17.4419F, 0F, 360F, Arc2D.PIE),
    new Arc2D.Float(54.3256F, 12.4651F, 17.4419F, 17.4419F, 0F, 360F, Arc2D.PIE),
    new Arc2D.Float(54.3256F, 12.4651F, 17.4419F, 17.4419F, 35F, 140F, Arc2D.PIE),
    new Arc2D.Float(54.3256F, 12.4651F, 17.4419F, 17.4419F, 215F, 140F, Arc2D.PIE),
    new Arc2D.Float(54.3256F, 12.4651F, 17.4419F, 17.4419F, -5F, 40F, Arc2D.PIE),
    new Arc2D.Float(54.3256F, 12.4651F, 17.4419F, 17.4419F, 175F, 40F, Arc2D.PIE),
    new Arc2D.Float(55.1977F, 13.3372F, 15.6977F, 15.6977F, 0F, 360F, Arc2D.PIE),
    new Arc2D.Float(54.3256F, 12.4651F, 17.4419F, 17.4419F, 0F, 360F, Arc2D.PIE),
    new Polygon( new int[] { 12, 19, 33, 39, 56, 61, 75, 80, 51, 47, 44, 12}, new int[] {2, 2, 8, 4, 4, 8, 2, 2, 27, 34, 27, 2}, 12),
    new Polygon( new int[] { 12, 18, 19, 19}, new int[] { 2, 4, 4,2}, 4),
    new Polygon( new int[] { 19, 19, 33, 33}, new int[] { 2, 4, 10,8}, 4),
    new Polygon( new int[] { 33, 33, 40, 39}, new int[] { 8, 10, 6,4}, 4),
    new Polygon( new int[] { 39, 40, 55, 56}, new int[] { 4, 6, 6,4}, 4),
    new Polygon( new int[] { 56, 55, 61, 61}, new int[] { 4, 6, 10,8}, 4),
    new Polygon( new int[] { 61, 61, 75, 75}, new int[] { 8, 10, 4,2}, 4),
    new Polygon( new int[] { 75, 75, 75, 80}, new int[] { 2, 4, 4,2}, 4),
    new Polygon( new int[] { 80, 75, 49, 51}, new int[] { 2, 4, 26,27}, 4),
    new Polygon( new int[] { 51, 49, 47, 47}, new int[] { 27, 26, 30,34}, 4),
    new Polygon( new int[] { 47, 47, 46, 44}, new int[] { 34, 30, 26,27}, 4),
    new Polygon( new int[] { 44, 46, 18, 12}, new int[] { 27, 26, 4,2}, 4),
  };
  public void paintComponent(Graphics g1) {
    animationCount = 1;
    if ( !visible)
      return;
    Graphics2D g = (Graphics2D) g1;
    float width = getWidth();
    float height = getHeight();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    if ( 45.0 <= rotate && rotate < 135.0) {
      g.translate( width, 0.0); 
      g.rotate( Math.PI * rotate/180, 0.0, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else if ( 135.0 <= rotate && rotate < 225.0)
    {
      g.rotate( Math.PI * rotate/180, width/2, height/2);
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    }
    else if ( 225.0 <= rotate && rotate < 315.0)
    {
      g.translate( -height, 0.0);
      g.rotate( Math.PI * rotate/180, height, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    if ( (dd.dynType & GeDyn.mDynType_Rotate) != 0 && dd.rotate != 0) {
      g.rotate( Math.PI * dd.rotate/180, 

           (dd.x0 - getX())*original_width/width,
           (dd.y0 - getY()) * original_height / height);
    }
    AffineTransform save = g.getTransform();
    AffineTransform save_tmp;
    int rounds = 1;
    if ( fillLevel != 1F)
      rounds = 2;
    int oldColor = 0;
    for ( int i = 0; i < rounds; i++) {
      if ( rounds == 2) {
        switch ( i) {
        case 0:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO) {
	    oldColor = colorTone;
	    colorTone = levelColorTone;
	  }
	  else if ( levelFillColor != GeColor.COLOR_NO) {
	    oldColor = fillColor;
	    fillColor = levelFillColor;
	  }
	  break;
        case 1:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO)
	    colorTone = oldColor;
	  else if ( levelFillColor != GeColor.COLOR_NO)
	    fillColor = oldColor;
	  break;
        }
        switch ( levelDirection) {
        case Ge.DIRECTION_UP:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,fillLevel*original_height+Ge.cJBean_Offset,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,fillLevel * original_height+Ge.cJBean_Offset));
	  break;
	case Ge.DIRECTION_DOWN:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,(1-fillLevel)*original_height+Ge.cJBean_Offset));
	  else
	    g.setClip(new Rectangle2D.Float(0F,(1-fillLevel)*original_height+Ge.cJBean_Offset,original_width,original_height));
	  break;
	case Ge.DIRECTION_RIGHT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(fillLevel*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,fillLevel*width+Ge.cJBean_Offset,height));
	  break;
	case Ge.DIRECTION_LEFT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,(1-fillLevel)*original_width+Ge.cJBean_Offset,original_height));
	  else
	    g.setClip(new Rectangle2D.Float((1-fillLevel)*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  break;
	}
      }
    g.setColor(GeColor.getColor(222, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[0]);
    {
    int fcolor = GeColor.getDrawtype(222, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[1]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[2]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[3]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[4]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[5]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[6]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[7]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[8]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[9]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(226, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[0]);
    if ( shadow == 0) {
    ((Arc2D)shapes[10]).setArcType(Arc2D.PIE);
    g.setColor(GeColor.getColor(222, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[10]);
    ((Arc2D)shapes[10]).setArcType(Arc2D.OPEN);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(226, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[10]);
    } else {
    ((Arc2D)shapes[11]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes[12]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes[13]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes[14]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes[15]).setArcType(Arc2D.PIE);
    {
    int fcolor = GeColor.getDrawtype(222, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[11]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[12]);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[13]);
    g.fill( shapes[14]);
    g.fill( shapes[15]);
    }
    ((Arc2D)shapes[16]).setArcType(Arc2D.OPEN);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(226, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[16]);
    }
    ((Arc2D)shapes[18]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes[19]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes[20]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes[21]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes[22]).setArcType(Arc2D.PIE);
    {
    int fcolor = GeColor.getDrawtype(222, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[18]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[19]);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[20]);
    g.fill( shapes[21]);
    g.fill( shapes[22]);
    }
    ((Arc2D)shapes[23]).setArcType(Arc2D.OPEN);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(226, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[23]);
    g.setColor(GeColor.getColor(222, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[24]);
    {
    int fcolor = GeColor.getDrawtype(222, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[25]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[26]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[27]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[28]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[29]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[30]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[31]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[32]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[33]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[34]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[35]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(226, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[24]);
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class JopSmallbutton extends GeComponent {
  // Dimension size;
  public JopSmallbutton( JopSession session)
  {
    super( session);
    size = new Dimension( 42, 18);
    annot1Font = new Font("Helvetica", Font.BOLD, 10);
  }
  int annot1Color = 0;
  public String getAnnot1() { return annot1;}
  public void setAnnot1( String s) { annot1 = s;}
  public void setAnnot1Font( Font font) { annot1Font = font;}
  public Font getAnnot1Font() { return annot1Font;}
  public void setAnnot1Color( int color) { annot1Color = color;}
  public int original_width = 42;
  public int original_height = 18;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 38.3721F, 14.8256F),
    new Polygon( new int[] { 2, 40, 38, 4, 4, 2}, new int[] { 2, 2, 4, 4, 14, 17}, 6), 
    new Polygon( new int[] { 40, 40, 38, 38, 4, 2}, new int[] { 17, 2, 4, 14, 14, 17}, 6), 
  };
  public void paintComponent(Graphics g1) {
    animationCount = 1;
    if ( !visible)
      return;
    Graphics2D g = (Graphics2D) g1;
    float width = getWidth();
    float height = getHeight();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    if ( 45.0 <= rotate && rotate < 135.0) {
      g.translate( width, 0.0); 
      g.rotate( Math.PI * rotate/180, 0.0, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else if ( 135.0 <= rotate && rotate < 225.0)
    {
      g.rotate( Math.PI * rotate/180, width/2, height/2);
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    }
    else if ( 225.0 <= rotate && rotate < 315.0)
    {
      g.translate( -height, 0.0);
      g.rotate( Math.PI * rotate/180, height, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    if ( (dd.dynType & GeDyn.mDynType_Rotate) != 0 && dd.rotate != 0) {
      g.rotate( Math.PI * dd.rotate/180, 

           (dd.x0 - getX())*original_width/width,
           (dd.y0 - getY()) * original_height / height);
    }
    AffineTransform save = g.getTransform();
    AffineTransform save_tmp;
    int rounds = 1;
    if ( fillLevel != 1F)
      rounds = 2;
    int oldColor = 0;
    for ( int i = 0; i < rounds; i++) {
      if ( rounds == 2) {
        switch ( i) {
        case 0:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO) {
	    oldColor = colorTone;
	    colorTone = levelColorTone;
	  }
	  else if ( levelFillColor != GeColor.COLOR_NO) {
	    oldColor = fillColor;
	    fillColor = levelFillColor;
	  }
	  break;
        case 1:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO)
	    colorTone = oldColor;
	  else if ( levelFillColor != GeColor.COLOR_NO)
	    fillColor = oldColor;
	  break;
        }
        switch ( levelDirection) {
        case Ge.DIRECTION_UP:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,fillLevel*original_height+Ge.cJBean_Offset,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,fillLevel * original_height+Ge.cJBean_Offset));
	  break;
	case Ge.DIRECTION_DOWN:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,(1-fillLevel)*original_height+Ge.cJBean_Offset));
	  else
	    g.setClip(new Rectangle2D.Float(0F,(1-fillLevel)*original_height+Ge.cJBean_Offset,original_width,original_height));
	  break;
	case Ge.DIRECTION_RIGHT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(fillLevel*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,fillLevel*width+Ge.cJBean_Offset,height));
	  break;
	case Ge.DIRECTION_LEFT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,(1-fillLevel)*original_width+Ge.cJBean_Offset,original_height));
	  else
	    g.setClip(new Rectangle2D.Float((1-fillLevel)*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  break;
	}
      }
    {
    int fcolor = GeColor.getDrawtype(102, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[0]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[1]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[2]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[0]);
    }
    g.setColor(GeColor.getColor( annot1Color , colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont( annot1Font);
    save_tmp = g.getTransform();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
    g.transform( AffineTransform.getScaleInstance( original_width/width *
      		height/original_height, 1));
    if ( annot1 != null)
      g.drawString( annot1, 6 * original_height / height * width / original_width, 13F);
    g.setTransform( save_tmp);
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class pwr_buttoninfo extends GeComponent {
  // Dimension size;
  public pwr_buttoninfo( JopSession session)
  {
    super( session);
    size = new Dimension( 82, 73);
  }
  public int original_width = 82;
  public int original_height = 73;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 78.4884F, 69.7674F),
    new Polygon( new int[] { 2, 80, 75, 8, 8, 2}, new int[] { 2, 2, 8, 8, 66, 72}, 6), 
    new Polygon( new int[] { 80, 80, 75, 75, 8, 2}, new int[] { 72, 2, 8, 66, 66, 72}, 6), 
    new Rectangle2D.Float(19.4419F, 15.9535F, 43.6047F, 41.7751F),
    new Polygon( new int[] { 32, 49, 49, 51, 53, 53, 32, 32, 33, 35, 35, 33, 32, 32}, new int[] {33, 33, 51, 53, 53, 54, 54, 53, 53, 51, 37, 35, 35, 35}, 14),
    new Arc2D.Float(35.1395F, 17.6977F, 13.9535F, 13.9535F, 0F, 360F, Arc2D.PIE),
    new Rectangle2D.Float(2F, 63.0465F, 8.72093F, 0F),
  };
  public void paintComponent(Graphics g1) {
    animationCount = 1;
    if ( !visible)
      return;
    Graphics2D g = (Graphics2D) g1;
    float width = getWidth();
    float height = getHeight();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    if ( 45.0 <= rotate && rotate < 135.0) {
      g.translate( width, 0.0); 
      g.rotate( Math.PI * rotate/180, 0.0, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else if ( 135.0 <= rotate && rotate < 225.0)
    {
      g.rotate( Math.PI * rotate/180, width/2, height/2);
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    }
    else if ( 225.0 <= rotate && rotate < 315.0)
    {
      g.translate( -height, 0.0);
      g.rotate( Math.PI * rotate/180, height, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    if ( (dd.dynType & GeDyn.mDynType_Rotate) != 0 && dd.rotate != 0) {
      g.rotate( Math.PI * dd.rotate/180, 

           (dd.x0 - getX())*original_width/width,
           (dd.y0 - getY()) * original_height / height);
    }
    AffineTransform save = g.getTransform();
    AffineTransform save_tmp;
    int rounds = 1;
    if ( fillLevel != 1F)
      rounds = 2;
    int oldColor = 0;
    for ( int i = 0; i < rounds; i++) {
      if ( rounds == 2) {
        switch ( i) {
        case 0:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO) {
	    oldColor = colorTone;
	    colorTone = levelColorTone;
	  }
	  else if ( levelFillColor != GeColor.COLOR_NO) {
	    oldColor = fillColor;
	    fillColor = levelFillColor;
	  }
	  break;
        case 1:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO)
	    colorTone = oldColor;
	  else if ( levelFillColor != GeColor.COLOR_NO)
	    fillColor = oldColor;
	  break;
        }
        switch ( levelDirection) {
        case Ge.DIRECTION_UP:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,fillLevel*original_height+Ge.cJBean_Offset,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,fillLevel * original_height+Ge.cJBean_Offset));
	  break;
	case Ge.DIRECTION_DOWN:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,(1-fillLevel)*original_height+Ge.cJBean_Offset));
	  else
	    g.setClip(new Rectangle2D.Float(0F,(1-fillLevel)*original_height+Ge.cJBean_Offset,original_width,original_height));
	  break;
	case Ge.DIRECTION_RIGHT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(fillLevel*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,fillLevel*width+Ge.cJBean_Offset,height));
	  break;
	case Ge.DIRECTION_LEFT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,(1-fillLevel)*original_width+Ge.cJBean_Offset,original_height));
	  else
	    g.setClip(new Rectangle2D.Float((1-fillLevel)*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  break;
	}
      }
    {
    int fcolor = GeColor.getDrawtype(222, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[0]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[1]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[2]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[0]);
    }
    {
    int fcolor = GeColor.getDrawtype(20, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[3]);
    }
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[4]);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[5]);
    {
    int fcolor = GeColor.getDrawtype(230, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[6]);
    }
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class help_button extends GeComponent {
  // Dimension size;
  public help_button( JopSession session)
  {
    super( session);
    size = new Dimension( 30, 30);
  }
  public int original_width = 30;
  public int original_height = 30;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 26.1628F, 26.1628F),
    new Polygon( new int[] { 2, 28, 26, 4, 4, 2}, new int[] { 2, 2, 4, 4, 26, 28}, 6), 
    new Polygon( new int[] { 28, 28, 26, 26, 4, 2}, new int[] { 28, 2, 4, 26, 26, 28}, 6), 
    new Polygon( new int[] { 10, 10, 12, 18, 19, 19, 17, 16, 16, 13, 13, 17, 17, 16, 13, 12, 12, 10}, new int[] {12, 10, 8, 8, 10, 12, 15, 16, 18, 18, 15, 12, 11, 10, 10, 11, 12, 12}, 18),
    new Polygon( new int[] { 10, 11, 11, 10}, new int[] { 12, 11, 10,10}, 4),
    new Polygon( new int[] { 10, 11, 12, 12}, new int[] { 10, 10, 9,8}, 4),
    new Polygon( new int[] { 12, 12, 17, 18}, new int[] { 8, 9, 9,8}, 4),
    new Polygon( new int[] { 18, 17, 18, 19}, new int[] { 8, 9, 10,10}, 4),
    new Polygon( new int[] { 19, 18, 18, 19}, new int[] { 10, 10, 12,12}, 4),
    new Polygon( new int[] { 19, 18, 16, 17}, new int[] { 12, 12, 14,15}, 4),
    new Polygon( new int[] { 17, 16, 15, 16}, new int[] { 15, 14, 16,16}, 4),
    new Polygon( new int[] { 16, 15, 15, 16}, new int[] { 16, 16, 17,18}, 4),
    new Polygon( new int[] { 16, 15, 14, 13}, new int[] { 18, 17, 17,18}, 4),
    new Polygon( new int[] { 13, 14, 14, 13}, new int[] { 18, 17, 16,15}, 4),
    new Polygon( new int[] { 13, 14, 18, 17}, new int[] { 15, 16, 13,12}, 4),
    new Polygon( new int[] { 17, 18, 18, 17}, new int[] { 12, 13, 11,11}, 4),
    new Polygon( new int[] { 17, 18, 16, 16}, new int[] { 11, 11, 9,10}, 4),
    new Polygon( new int[] { 16, 16, 13, 13}, new int[] { 10, 9, 9,10}, 4),
    new Polygon( new int[] { 13, 13, 11, 12}, new int[] { 10, 9, 11,11}, 4),
    new Polygon( new int[] { 12, 11, 11, 12}, new int[] { 11, 11, 11,12}, 4),
    new Polygon( new int[] { 12, 11, 11, 10}, new int[] { 12, 11, 11,12}, 4),
    new Rectangle2D.Float(13.3372F, 18.5698F, 2.61628F, 2.61628F),
    new Polygon( new int[] { 13, 16, 15, 14, 14, 13}, new int[] { 19, 19, 19, 19, 21, 21}, 6), 
    new Polygon( new int[] { 16, 16, 15, 15, 14, 13}, new int[] { 21, 19, 19, 21, 21, 21}, 6), 
  };
  public void paintComponent(Graphics g1) {
    animationCount = 1;
    if ( !visible)
      return;
    Graphics2D g = (Graphics2D) g1;
    float width = getWidth();
    float height = getHeight();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    if ( 45.0 <= rotate && rotate < 135.0) {
      g.translate( width, 0.0); 
      g.rotate( Math.PI * rotate/180, 0.0, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else if ( 135.0 <= rotate && rotate < 225.0)
    {
      g.rotate( Math.PI * rotate/180, width/2, height/2);
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    }
    else if ( 225.0 <= rotate && rotate < 315.0)
    {
      g.translate( -height, 0.0);
      g.rotate( Math.PI * rotate/180, height, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    if ( (dd.dynType & GeDyn.mDynType_Rotate) != 0 && dd.rotate != 0) {
      g.rotate( Math.PI * dd.rotate/180, 

           (dd.x0 - getX())*original_width/width,
           (dd.y0 - getY()) * original_height / height);
    }
    AffineTransform save = g.getTransform();
    AffineTransform save_tmp;
    int rounds = 1;
    if ( fillLevel != 1F)
      rounds = 2;
    int oldColor = 0;
    for ( int i = 0; i < rounds; i++) {
      if ( rounds == 2) {
        switch ( i) {
        case 0:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO) {
	    oldColor = colorTone;
	    colorTone = levelColorTone;
	  }
	  else if ( levelFillColor != GeColor.COLOR_NO) {
	    oldColor = fillColor;
	    fillColor = levelFillColor;
	  }
	  break;
        case 1:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO)
	    colorTone = oldColor;
	  else if ( levelFillColor != GeColor.COLOR_NO)
	    fillColor = oldColor;
	  break;
        }
        switch ( levelDirection) {
        case Ge.DIRECTION_UP:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,fillLevel*original_height+Ge.cJBean_Offset,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,fillLevel * original_height+Ge.cJBean_Offset));
	  break;
	case Ge.DIRECTION_DOWN:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,(1-fillLevel)*original_height+Ge.cJBean_Offset));
	  else
	    g.setClip(new Rectangle2D.Float(0F,(1-fillLevel)*original_height+Ge.cJBean_Offset,original_width,original_height));
	  break;
	case Ge.DIRECTION_RIGHT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(fillLevel*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,fillLevel*width+Ge.cJBean_Offset,height));
	  break;
	case Ge.DIRECTION_LEFT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,(1-fillLevel)*original_width+Ge.cJBean_Offset,original_height));
	  else
	    g.setClip(new Rectangle2D.Float((1-fillLevel)*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  break;
	}
      }
    {
    int fcolor = GeColor.getDrawtype(42, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[0]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[1]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[2]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[0]);
    }
    g.setColor(GeColor.getColor(58, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[3]);
    {
    int fcolor = GeColor.getDrawtype(58, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[4]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[5]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[6]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[7]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[8]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[9]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[10]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[11]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[12]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[13]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[14]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[15]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[16]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[17]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[18]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[19]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[20]);
    }
    }
    {
    int fcolor = GeColor.getDrawtype(58, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[21]);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[22]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[23]);
    }
    }
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class pwr_valueinputmediumrd extends GeTextField {
  public pwr_valueinputmediumrd( JopSession session)
  {
    super( session);
    setFont( annotFont);
    setFillColor( 21);
  }
  int original_width = 61;
  int original_height = 26;
  boolean fontSet = false;
  public void paintComponent(Graphics g1) {
    if ( !fontSet) {
      float width = getWidth();
      float height = getHeight();
      setFont( annotFont.deriveFont((float)(height / original_height * annotFont.getSize())));
      fontSet = true;
    }
    super.paintComponent( g1);
  }
}
protected class mcomp_abb_acs800fanaggr extends GeComponent {
  // Dimension size;
  public mcomp_abb_acs800fanaggr( JopSession session)
  {
    super( session);
    size = new Dimension( 56, 38);
    annot1Font = new Font("Helvetica", Font.BOLD, 12);
    pages = 2;
  }
  int annot1Color = 0;
  public String getAnnot1() { return annot1;}
  public void setAnnot1( String s) { annot1 = s;}
  public void setAnnot1Font( Font font) { annot1Font = font;}
  public Font getAnnot1Font() { return annot1Font;}
  public void setAnnot1Color( int color) { annot1Color = color;}
  public int original_width = 56;
  public int original_height = 38;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(36.8837F, 2F, 17.4419F, 13.9535F),
    new Arc2D.Float(2F, 2F, 34.8837F, 34.8837F, 0F, 360F, Arc2D.PIE),
    new Arc2D.Float(2F, 2F, 34.8837F, 34.8837F, 35F, 140F, Arc2D.PIE),
    new Arc2D.Float(2F, 2F, 34.8837F, 34.8837F, 215F, 140F, Arc2D.PIE),
    new Arc2D.Float(2F, 2F, 34.8837F, 34.8837F, -5F, 40F, Arc2D.PIE),
    new Arc2D.Float(2F, 2F, 34.8837F, 34.8837F, 175F, 40F, Arc2D.PIE),
    new Arc2D.Float(4.7907F, 4.7907F, 29.3023F, 29.3023F, 0F, 360F, Arc2D.PIE),
    new Arc2D.Float(2F, 2F, 34.8837F, 34.8837F, 0F, 360F, Arc2D.PIE),
    new Polygon( new int[] { 7, 32, 19, 7, 19, 32}, new int[] {12, 12, 33, 13, 33, 12}, 6),
  };
  int original_width_p2 = 56;
  int original_height_p2 = 38;
  Shape[] shapes_p2 = new Shape[] { 
    new Rectangle2D.Float(36.8837F, 2F, 17.4419F, 13.9535F),
    new Arc2D.Float(2F, 2F, 34.8837F, 34.8837F, 0F, 360F, Arc2D.PIE),
    new Arc2D.Float(2F, 2F, 34.8837F, 34.8837F, 35F, 140F, Arc2D.PIE),
    new Arc2D.Float(2F, 2F, 34.8837F, 34.8837F, 215F, 140F, Arc2D.PIE),
    new Arc2D.Float(2F, 2F, 34.8837F, 34.8837F, -5F, 40F, Arc2D.PIE),
    new Arc2D.Float(2F, 2F, 34.8837F, 34.8837F, 175F, 40F, Arc2D.PIE),
    new Arc2D.Float(4.7907F, 4.7907F, 29.3023F, 29.3023F, 0F, 360F, Arc2D.PIE),
    new Arc2D.Float(2F, 2F, 34.8837F, 34.8837F, 0F, 360F, Arc2D.PIE),
    new Polygon( new int[] { 12, 12, 33, 13, 33, 12}, new int[] {32, 7, 19, 32, 19, 7}, 6),
  };
  public void paintComponent(Graphics g1) {
    switch ( page) {
      case 2 :
        paintComponent_p2(g1);
        return;
      default:
        ;
    }
    animationCount = 1;
    if ( !visible)
      return;
    Graphics2D g = (Graphics2D) g1;
    float width = getWidth();
    float height = getHeight();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    if ( 45.0 <= rotate && rotate < 135.0) {
      g.translate( width, 0.0); 
      g.rotate( Math.PI * rotate/180, 0.0, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else if ( 135.0 <= rotate && rotate < 225.0)
    {
      g.rotate( Math.PI * rotate/180, width/2, height/2);
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    }
    else if ( 225.0 <= rotate && rotate < 315.0)
    {
      g.translate( -height, 0.0);
      g.rotate( Math.PI * rotate/180, height, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    if ( (dd.dynType & GeDyn.mDynType_Rotate) != 0 && dd.rotate != 0) {
      g.rotate( Math.PI * dd.rotate/180, 

           (dd.x0 - getX())*original_width/width,
           (dd.y0 - getY()) * original_height / height);
    }
    AffineTransform save = g.getTransform();
    AffineTransform save_tmp;
    int rounds = 1;
    if ( fillLevel != 1F)
      rounds = 2;
    int oldColor = 0;
    for ( int i = 0; i < rounds; i++) {
      if ( rounds == 2) {
        switch ( i) {
        case 0:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO) {
	    oldColor = colorTone;
	    colorTone = levelColorTone;
	  }
	  else if ( levelFillColor != GeColor.COLOR_NO) {
	    oldColor = fillColor;
	    fillColor = levelFillColor;
	  }
	  break;
        case 1:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO)
	    colorTone = oldColor;
	  else if ( levelFillColor != GeColor.COLOR_NO)
	    fillColor = oldColor;
	  break;
        }
        switch ( levelDirection) {
        case Ge.DIRECTION_UP:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,fillLevel*original_height+Ge.cJBean_Offset,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,fillLevel * original_height+Ge.cJBean_Offset));
	  break;
	case Ge.DIRECTION_DOWN:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,(1-fillLevel)*original_height+Ge.cJBean_Offset));
	  else
	    g.setClip(new Rectangle2D.Float(0F,(1-fillLevel)*original_height+Ge.cJBean_Offset,original_width,original_height));
	  break;
	case Ge.DIRECTION_RIGHT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(fillLevel*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,fillLevel*width+Ge.cJBean_Offset,height));
	  break;
	case Ge.DIRECTION_LEFT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,(1-fillLevel)*original_width+Ge.cJBean_Offset,original_height));
	  else
	    g.setClip(new Rectangle2D.Float((1-fillLevel)*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  break;
	}
      }
    {
    int fcolor = GeColor.getDrawtype(300, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[0]);
    }
    if ( shadow == 0) {
    ((Arc2D)shapes[1]).setArcType(Arc2D.PIE);
    g.setColor(GeColor.getColor(74, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[1]);
    ((Arc2D)shapes[1]).setArcType(Arc2D.OPEN);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[1]);
    } else {
    ((Arc2D)shapes[2]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes[3]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes[4]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes[5]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes[6]).setArcType(Arc2D.PIE);
    {
    int fcolor = GeColor.getDrawtype(74, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[2]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[3]);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[4]);
    g.fill( shapes[5]);
    g.fill( shapes[6]);
    }
    ((Arc2D)shapes[7]).setArcType(Arc2D.OPEN);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[7]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[8]);
    g.setColor(GeColor.getColor( annot1Color , colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont( annot1Font);
    save_tmp = g.getTransform();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
    g.transform( AffineTransform.getScaleInstance( original_width/width *
      		height/original_height, 1));
    if ( annot1 != null)
      g.drawString( annot1, 37 * original_height / height * width / original_width, 15F);
    g.setTransform( save_tmp);
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public void paintComponent_p2(Graphics g1) {
    animationCount = 1;
    if ( !visible)
      return;
    Graphics2D g = (Graphics2D) g1;
    float width = getWidth();
    float height = getHeight();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    if ( 45.0 <= rotate && rotate < 135.0) {
      g.translate( width, 0.0); 
      g.rotate( Math.PI * rotate/180, 0.0, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else if ( 135.0 <= rotate && rotate < 225.0)
    {
      g.rotate( Math.PI * rotate/180, width/2, height/2);
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    }
    else if ( 225.0 <= rotate && rotate < 315.0)
    {
      g.translate( -height, 0.0);
      g.rotate( Math.PI * rotate/180, height, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    if ( (dd.dynType & GeDyn.mDynType_Rotate) != 0 && dd.rotate != 0) {
      g.rotate( Math.PI * dd.rotate/180, 

           (dd.x0 - getX())*original_width/width,
           (dd.y0 - getY()) * original_height / height);
    }
    AffineTransform save = g.getTransform();
    AffineTransform save_tmp;
    int rounds = 1;
    if ( fillLevel != 1F)
      rounds = 2;
    int oldColor = 0;
    for ( int i = 0; i < rounds; i++) {
      if ( rounds == 2) {
        switch ( i) {
        case 0:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO) {
	    oldColor = colorTone;
	    colorTone = levelColorTone;
	  }
	  else if ( levelFillColor != GeColor.COLOR_NO) {
	    oldColor = fillColor;
	    fillColor = levelFillColor;
	  }
	  break;
        case 1:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO)
	    colorTone = oldColor;
	  else if ( levelFillColor != GeColor.COLOR_NO)
	    fillColor = oldColor;
	  break;
        }
        switch ( levelDirection) {
        case Ge.DIRECTION_UP:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,fillLevel*original_height+Ge.cJBean_Offset,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,fillLevel * original_height+Ge.cJBean_Offset));
	  break;
	case Ge.DIRECTION_DOWN:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,(1-fillLevel)*original_height+Ge.cJBean_Offset));
	  else
	    g.setClip(new Rectangle2D.Float(0F,(1-fillLevel)*original_height+Ge.cJBean_Offset,original_width,original_height));
	  break;
	case Ge.DIRECTION_RIGHT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(fillLevel*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,fillLevel*width+Ge.cJBean_Offset,height));
	  break;
	case Ge.DIRECTION_LEFT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,(1-fillLevel)*original_width+Ge.cJBean_Offset,original_height));
	  else
	    g.setClip(new Rectangle2D.Float((1-fillLevel)*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  break;
	}
      }
    {
    int fcolor = GeColor.getDrawtype(300, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes_p2[0]);
    }
    if ( shadow == 0) {
    ((Arc2D)shapes_p2[1]).setArcType(Arc2D.PIE);
    g.setColor(GeColor.getColor(74, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes_p2[1]);
    ((Arc2D)shapes_p2[1]).setArcType(Arc2D.OPEN);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[1]);
    } else {
    ((Arc2D)shapes_p2[2]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes_p2[3]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes_p2[4]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes_p2[5]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes_p2[6]).setArcType(Arc2D.PIE);
    {
    int fcolor = GeColor.getDrawtype(74, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes_p2[2]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes_p2[3]);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes_p2[4]);
    g.fill( shapes_p2[5]);
    g.fill( shapes_p2[6]);
    }
    ((Arc2D)shapes_p2[7]).setArcType(Arc2D.OPEN);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[7]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[8]);
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class bcomp_mvalve extends GeComponent {
  // Dimension size;
  public bcomp_mvalve( JopSession session)
  {
    super( session);
    size = new Dimension( 56, 38);
    annot1Font = new Font("Helvetica", Font.BOLD, 12);
  }
  int annot1Color = 0;
  public String getAnnot1() { return annot1;}
  public void setAnnot1( String s) { annot1 = s;}
  public void setAnnot1Font( Font font) { annot1Font = font;}
  public Font getAnnot1Font() { return annot1Font;}
  public void setAnnot1Color( int color) { annot1Color = color;}
  public int original_width = 56;
  public int original_height = 38;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(36.8837F, 2F, 17.4419F, 17.4419F),
    new Polygon( new int[] { 2, 2, 19, 2}, new int[] {19, 37, 28, 19}, 4),
    new Polygon( new int[] { 2, 3, 3, 2}, new int[] { 19, 21, 35,37}, 4),
    new Polygon( new int[] { 2, 3, 17, 19}, new int[] { 37, 35, 28,28}, 4),
    new Polygon( new int[] { 19, 17, 3, 2}, new int[] { 28, 28, 21,19}, 4),
    new Polygon( new int[] { 37, 37, 19, 37}, new int[] {19, 37, 28, 19}, 4),
    new Polygon( new int[] { 37, 36, 36, 37}, new int[] { 19, 21, 35,37}, 4),
    new Polygon( new int[] { 37, 36, 21, 19}, new int[] { 37, 35, 28,28}, 4),
    new Polygon( new int[] { 19, 21, 36, 37}, new int[] { 28, 28, 21,19}, 4),
  };
  public void paintComponent(Graphics g1) {
    animationCount = 1;
    if ( !visible)
      return;
    Graphics2D g = (Graphics2D) g1;
    float width = getWidth();
    float height = getHeight();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    if ( 45.0 <= rotate && rotate < 135.0) {
      g.translate( width, 0.0); 
      g.rotate( Math.PI * rotate/180, 0.0, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else if ( 135.0 <= rotate && rotate < 225.0)
    {
      g.rotate( Math.PI * rotate/180, width/2, height/2);
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    }
    else if ( 225.0 <= rotate && rotate < 315.0)
    {
      g.translate( -height, 0.0);
      g.rotate( Math.PI * rotate/180, height, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    if ( (dd.dynType & GeDyn.mDynType_Rotate) != 0 && dd.rotate != 0) {
      g.rotate( Math.PI * dd.rotate/180, 

           (dd.x0 - getX())*original_width/width,
           (dd.y0 - getY()) * original_height / height);
    }
    AffineTransform save = g.getTransform();
    AffineTransform save_tmp;
    int rounds = 1;
    if ( fillLevel != 1F)
      rounds = 2;
    int oldColor = 0;
    for ( int i = 0; i < rounds; i++) {
      if ( rounds == 2) {
        switch ( i) {
        case 0:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO) {
	    oldColor = colorTone;
	    colorTone = levelColorTone;
	  }
	  else if ( levelFillColor != GeColor.COLOR_NO) {
	    oldColor = fillColor;
	    fillColor = levelFillColor;
	  }
	  break;
        case 1:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO)
	    colorTone = oldColor;
	  else if ( levelFillColor != GeColor.COLOR_NO)
	    fillColor = oldColor;
	  break;
        }
        switch ( levelDirection) {
        case Ge.DIRECTION_UP:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,fillLevel*original_height+Ge.cJBean_Offset,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,fillLevel * original_height+Ge.cJBean_Offset));
	  break;
	case Ge.DIRECTION_DOWN:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,(1-fillLevel)*original_height+Ge.cJBean_Offset));
	  else
	    g.setClip(new Rectangle2D.Float(0F,(1-fillLevel)*original_height+Ge.cJBean_Offset,original_width,original_height));
	  break;
	case Ge.DIRECTION_RIGHT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(fillLevel*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,fillLevel*width+Ge.cJBean_Offset,height));
	  break;
	case Ge.DIRECTION_LEFT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,(1-fillLevel)*original_width+Ge.cJBean_Offset,original_height));
	  else
	    g.setClip(new Rectangle2D.Float((1-fillLevel)*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  break;
	}
      }
    {
    int fcolor = GeColor.getDrawtype(300, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[0]);
    }
    g.setColor(GeColor.getColor(74, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[1]);
    {
    int fcolor = GeColor.getDrawtype(74, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[2]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[3]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[4]);
    }
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[1]);
    g.setColor(GeColor.getColor(74, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[5]);
    {
    int fcolor = GeColor.getDrawtype(74, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[6]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[7]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[8]);
    }
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[5]);
    g.setColor(GeColor.getColor( annot1Color , colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont( annot1Font);
    save_tmp = g.getTransform();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
    g.transform( AffineTransform.getScaleInstance( original_width/width *
      		height/original_height, 1));
    if ( annot1 != null)
      g.drawString( annot1, 37 * original_height / height * width / original_width, 19F);
    g.setTransform( save_tmp);
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class bcomp_pressuresensor extends GeComponent {
  // Dimension size;
  public bcomp_pressuresensor( JopSession session)
  {
    super( session);
    size = new Dimension( 21, 21);
  }
  public int original_width = 21;
  public int original_height = 21;
  Shape[] shapes = new Shape[] { 
    new Polygon( new int[] { 11, 2, 19, 11}, new int[] {19, 2, 2, 19}, 4),
    new Polygon( new int[] { 11, 11, 5, 2}, new int[] { 19, 15, 4,2}, 4),
    new Polygon( new int[] { 2, 5, 17, 19}, new int[] { 2, 4, 4,2}, 4),
    new Polygon( new int[] { 19, 17, 11, 11}, new int[] { 2, 4, 15,19}, 4),
  };
  public void paintComponent(Graphics g1) {
    animationCount = 1;
    if ( !visible)
      return;
    Graphics2D g = (Graphics2D) g1;
    float width = getWidth();
    float height = getHeight();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    if ( 45.0 <= rotate && rotate < 135.0) {
      g.translate( width, 0.0); 
      g.rotate( Math.PI * rotate/180, 0.0, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else if ( 135.0 <= rotate && rotate < 225.0)
    {
      g.rotate( Math.PI * rotate/180, width/2, height/2);
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    }
    else if ( 225.0 <= rotate && rotate < 315.0)
    {
      g.translate( -height, 0.0);
      g.rotate( Math.PI * rotate/180, height, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    if ( (dd.dynType & GeDyn.mDynType_Rotate) != 0 && dd.rotate != 0) {
      g.rotate( Math.PI * dd.rotate/180, 

           (dd.x0 - getX())*original_width/width,
           (dd.y0 - getY()) * original_height / height);
    }
    AffineTransform save = g.getTransform();
    AffineTransform save_tmp;
    int rounds = 1;
    if ( fillLevel != 1F)
      rounds = 2;
    int oldColor = 0;
    for ( int i = 0; i < rounds; i++) {
      if ( rounds == 2) {
        switch ( i) {
        case 0:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO) {
	    oldColor = colorTone;
	    colorTone = levelColorTone;
	  }
	  else if ( levelFillColor != GeColor.COLOR_NO) {
	    oldColor = fillColor;
	    fillColor = levelFillColor;
	  }
	  break;
        case 1:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO)
	    colorTone = oldColor;
	  else if ( levelFillColor != GeColor.COLOR_NO)
	    fillColor = oldColor;
	  break;
        }
        switch ( levelDirection) {
        case Ge.DIRECTION_UP:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,fillLevel*original_height+Ge.cJBean_Offset,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,fillLevel * original_height+Ge.cJBean_Offset));
	  break;
	case Ge.DIRECTION_DOWN:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,(1-fillLevel)*original_height+Ge.cJBean_Offset));
	  else
	    g.setClip(new Rectangle2D.Float(0F,(1-fillLevel)*original_height+Ge.cJBean_Offset,original_width,original_height));
	  break;
	case Ge.DIRECTION_RIGHT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(fillLevel*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,fillLevel*width+Ge.cJBean_Offset,height));
	  break;
	case Ge.DIRECTION_LEFT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,(1-fillLevel)*original_width+Ge.cJBean_Offset,original_height));
	  else
	    g.setClip(new Rectangle2D.Float((1-fillLevel)*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  break;
	}
      }
    g.setColor(GeColor.getColor(74, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[0]);
    {
    int fcolor = GeColor.getDrawtype(74, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[1]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[2]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[3]);
    }
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[0]);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "P",9, 12);
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class pwr_pidcontroller extends GeComponent {
  // Dimension size;
  public pwr_pidcontroller( JopSession session)
  {
    super( session);
    size = new Dimension( 38, 38);
    annot1Font = new Font("Helvetica", Font.BOLD, 10);
  }
  int annot1Color = 0;
  public String getAnnot1() { return annot1;}
  public void setAnnot1( String s) { annot1 = s;}
  public void setAnnot1Font( Font font) { annot1Font = font;}
  public Font getAnnot1Font() { return annot1Font;}
  public void setAnnot1Color( int color) { annot1Color = color;}
  public int original_width = 38;
  public int original_height = 38;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 34.8837F, 34.8837F),
    new Polygon( new int[] { 2, 37, 35, 4, 4, 2}, new int[] { 2, 2, 4, 4, 35, 37}, 6), 
    new Polygon( new int[] { 37, 37, 35, 35, 4, 2}, new int[] { 37, 2, 4, 35, 35, 37}, 6), 
    new Line2D.Float( 36.8837F, 19.4419F, 22.9302F, 2F),
    new Line2D.Float( 36.8837F, 19.4419F, 22.9302F, 36.8837F),
  };
  public void paintComponent(Graphics g1) {
    animationCount = 1;
    if ( !visible)
      return;
    Graphics2D g = (Graphics2D) g1;
    float width = getWidth();
    float height = getHeight();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    if ( 45.0 <= rotate && rotate < 135.0) {
      g.translate( width, 0.0); 
      g.rotate( Math.PI * rotate/180, 0.0, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else if ( 135.0 <= rotate && rotate < 225.0)
    {
      g.rotate( Math.PI * rotate/180, width/2, height/2);
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    }
    else if ( 225.0 <= rotate && rotate < 315.0)
    {
      g.translate( -height, 0.0);
      g.rotate( Math.PI * rotate/180, height, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    if ( (dd.dynType & GeDyn.mDynType_Rotate) != 0 && dd.rotate != 0) {
      g.rotate( Math.PI * dd.rotate/180, 

           (dd.x0 - getX())*original_width/width,
           (dd.y0 - getY()) * original_height / height);
    }
    AffineTransform save = g.getTransform();
    AffineTransform save_tmp;
    int rounds = 1;
    if ( fillLevel != 1F)
      rounds = 2;
    int oldColor = 0;
    for ( int i = 0; i < rounds; i++) {
      if ( rounds == 2) {
        switch ( i) {
        case 0:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO) {
	    oldColor = colorTone;
	    colorTone = levelColorTone;
	  }
	  else if ( levelFillColor != GeColor.COLOR_NO) {
	    oldColor = fillColor;
	    fillColor = levelFillColor;
	  }
	  break;
        case 1:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO)
	    colorTone = oldColor;
	  else if ( levelFillColor != GeColor.COLOR_NO)
	    fillColor = oldColor;
	  break;
        }
        switch ( levelDirection) {
        case Ge.DIRECTION_UP:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,fillLevel*original_height+Ge.cJBean_Offset,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,fillLevel * original_height+Ge.cJBean_Offset));
	  break;
	case Ge.DIRECTION_DOWN:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,(1-fillLevel)*original_height+Ge.cJBean_Offset));
	  else
	    g.setClip(new Rectangle2D.Float(0F,(1-fillLevel)*original_height+Ge.cJBean_Offset,original_width,original_height));
	  break;
	case Ge.DIRECTION_RIGHT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(fillLevel*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,fillLevel*width+Ge.cJBean_Offset,height));
	  break;
	case Ge.DIRECTION_LEFT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,(1-fillLevel)*original_width+Ge.cJBean_Offset,original_height));
	  else
	    g.setClip(new Rectangle2D.Float((1-fillLevel)*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  break;
	}
      }
    {
    int fcolor = GeColor.getDrawtype(52, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[0]);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[1]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[2]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[0]);
    }
    FontRenderContext frc = g.getFontRenderContext();
    g.setColor(GeColor.getColor( annot1Color , colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont( annot1Font);
    save_tmp = g.getTransform();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
    g.transform( AffineTransform.getScaleInstance( original_width/width *
      		height/original_height, 1));
    if ( annot1 != null)
      g.drawString( annot1, 14 * original_height / height * width / original_width- (float)g.getFont().getStringBounds(annot1, frc).getWidth()/2, 25F);
    g.setTransform( save_tmp);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[3]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[4]);
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class pwr_valuemedium extends GeComponent {
  // Dimension size;
  public pwr_valuemedium( JopSession session)
  {
    super( session);
    size = new Dimension( 56, 21);
    annot1Font = new Font("Helvetica", Font.BOLD, 12);
  }
  int annot1Color = 0;
  public String getAnnot1() { return annot1;}
  public void setAnnot1( String s) { annot1 = s;}
  public void setAnnot1Font( Font font) { annot1Font = font;}
  public Font getAnnot1Font() { return annot1Font;}
  public void setAnnot1Color( int color) { annot1Color = color;}
  public int original_width = 56;
  public int original_height = 21;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 52.3256F, 17.4419F),
    new Polygon( new int[] { 2, 54, 53, 4, 4, 2}, new int[] { 2, 2, 4, 4, 18, 19}, 6), 
    new Polygon( new int[] { 54, 54, 53, 53, 4, 2}, new int[] { 19, 2, 4, 18, 18, 19}, 6), 
  };
  public void paintComponent(Graphics g1) {
    animationCount = 1;
    if ( !visible)
      return;
    Graphics2D g = (Graphics2D) g1;
    float width = getWidth();
    float height = getHeight();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    if ( 45.0 <= rotate && rotate < 135.0) {
      g.translate( width, 0.0); 
      g.rotate( Math.PI * rotate/180, 0.0, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else if ( 135.0 <= rotate && rotate < 225.0)
    {
      g.rotate( Math.PI * rotate/180, width/2, height/2);
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    }
    else if ( 225.0 <= rotate && rotate < 315.0)
    {
      g.translate( -height, 0.0);
      g.rotate( Math.PI * rotate/180, height, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    if ( (dd.dynType & GeDyn.mDynType_Rotate) != 0 && dd.rotate != 0) {
      g.rotate( Math.PI * dd.rotate/180, 

           (dd.x0 - getX())*original_width/width,
           (dd.y0 - getY()) * original_height / height);
    }
    AffineTransform save = g.getTransform();
    AffineTransform save_tmp;
    int rounds = 1;
    if ( fillLevel != 1F)
      rounds = 2;
    int oldColor = 0;
    for ( int i = 0; i < rounds; i++) {
      if ( rounds == 2) {
        switch ( i) {
        case 0:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO) {
	    oldColor = colorTone;
	    colorTone = levelColorTone;
	  }
	  else if ( levelFillColor != GeColor.COLOR_NO) {
	    oldColor = fillColor;
	    fillColor = levelFillColor;
	  }
	  break;
        case 1:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO)
	    colorTone = oldColor;
	  else if ( levelFillColor != GeColor.COLOR_NO)
	    fillColor = oldColor;
	  break;
        }
        switch ( levelDirection) {
        case Ge.DIRECTION_UP:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,fillLevel*original_height+Ge.cJBean_Offset,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,fillLevel * original_height+Ge.cJBean_Offset));
	  break;
	case Ge.DIRECTION_DOWN:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,(1-fillLevel)*original_height+Ge.cJBean_Offset));
	  else
	    g.setClip(new Rectangle2D.Float(0F,(1-fillLevel)*original_height+Ge.cJBean_Offset,original_width,original_height));
	  break;
	case Ge.DIRECTION_RIGHT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(fillLevel*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,fillLevel*width+Ge.cJBean_Offset,height));
	  break;
	case Ge.DIRECTION_LEFT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,(1-fillLevel)*original_width+Ge.cJBean_Offset,original_height));
	  else
	    g.setClip(new Rectangle2D.Float((1-fillLevel)*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  break;
	}
      }
    {
    int fcolor = GeColor.getDrawtype(41, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[0]);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[1]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[2]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[0]);
    }
    g.setColor(GeColor.getColor( annot1Color , colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont( annot1Font);
    save_tmp = g.getTransform();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
    g.transform( AffineTransform.getScaleInstance( original_width/width *
      		height/original_height, 1));
    if ( annot1 != null)
      g.drawString( annot1, 8 * original_height / height * width / original_width, 15F);
    g.setTransform( save_tmp);
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class bcomp_pressureswitch extends GeComponent {
  // Dimension size;
  public bcomp_pressureswitch( JopSession session)
  {
    super( session);
    size = new Dimension( 21, 21);
  }
  public int original_width = 21;
  public int original_height = 21;
  Shape[] shapes = new Shape[] { 
    new Polygon( new int[] { 11, 2, 19, 11}, new int[] {19, 2, 2, 19}, 4),
    new Polygon( new int[] { 11, 11, 5, 2}, new int[] { 19, 15, 4,2}, 4),
    new Polygon( new int[] { 2, 5, 17, 19}, new int[] { 2, 4, 4,2}, 4),
    new Polygon( new int[] { 19, 17, 11, 11}, new int[] { 2, 4, 15,19}, 4),
  };
  public void paintComponent(Graphics g1) {
    animationCount = 1;
    if ( !visible)
      return;
    Graphics2D g = (Graphics2D) g1;
    float width = getWidth();
    float height = getHeight();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    if ( 45.0 <= rotate && rotate < 135.0) {
      g.translate( width, 0.0); 
      g.rotate( Math.PI * rotate/180, 0.0, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else if ( 135.0 <= rotate && rotate < 225.0)
    {
      g.rotate( Math.PI * rotate/180, width/2, height/2);
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    }
    else if ( 225.0 <= rotate && rotate < 315.0)
    {
      g.translate( -height, 0.0);
      g.rotate( Math.PI * rotate/180, height, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    if ( (dd.dynType & GeDyn.mDynType_Rotate) != 0 && dd.rotate != 0) {
      g.rotate( Math.PI * dd.rotate/180, 

           (dd.x0 - getX())*original_width/width,
           (dd.y0 - getY()) * original_height / height);
    }
    AffineTransform save = g.getTransform();
    AffineTransform save_tmp;
    int rounds = 1;
    if ( fillLevel != 1F)
      rounds = 2;
    int oldColor = 0;
    for ( int i = 0; i < rounds; i++) {
      if ( rounds == 2) {
        switch ( i) {
        case 0:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO) {
	    oldColor = colorTone;
	    colorTone = levelColorTone;
	  }
	  else if ( levelFillColor != GeColor.COLOR_NO) {
	    oldColor = fillColor;
	    fillColor = levelFillColor;
	  }
	  break;
        case 1:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO)
	    colorTone = oldColor;
	  else if ( levelFillColor != GeColor.COLOR_NO)
	    fillColor = oldColor;
	  break;
        }
        switch ( levelDirection) {
        case Ge.DIRECTION_UP:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,fillLevel*original_height+Ge.cJBean_Offset,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,fillLevel * original_height+Ge.cJBean_Offset));
	  break;
	case Ge.DIRECTION_DOWN:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,(1-fillLevel)*original_height+Ge.cJBean_Offset));
	  else
	    g.setClip(new Rectangle2D.Float(0F,(1-fillLevel)*original_height+Ge.cJBean_Offset,original_width,original_height));
	  break;
	case Ge.DIRECTION_RIGHT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(fillLevel*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,fillLevel*width+Ge.cJBean_Offset,height));
	  break;
	case Ge.DIRECTION_LEFT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,(1-fillLevel)*original_width+Ge.cJBean_Offset,original_height));
	  else
	    g.setClip(new Rectangle2D.Float((1-fillLevel)*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  break;
	}
      }
    g.setColor(GeColor.getColor(74, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[0]);
    {
    int fcolor = GeColor.getDrawtype(74, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[1]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[2]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[3]);
    }
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[0]);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "P",9, 12);
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class bcomp_tempsensor extends GeComponent {
  // Dimension size;
  public bcomp_tempsensor( JopSession session)
  {
    super( session);
    size = new Dimension( 21, 21);
  }
  public int original_width = 21;
  public int original_height = 21;
  Shape[] shapes = new Shape[] { 
    new Polygon( new int[] { 11, 2, 19, 11}, new int[] {19, 2, 2, 19}, 4),
    new Polygon( new int[] { 11, 11, 5, 2}, new int[] { 19, 15, 4,2}, 4),
    new Polygon( new int[] { 2, 5, 17, 19}, new int[] { 2, 4, 4,2}, 4),
    new Polygon( new int[] { 19, 17, 11, 11}, new int[] { 2, 4, 15,19}, 4),
    new Line2D.Float( 13.3372F, 5.48837F, 8.10465F, 5.48837F),
    new Line2D.Float( 10.7209F, 11.593F, 10.7209F, 5.48837F),
  };
  public void paintComponent(Graphics g1) {
    animationCount = 1;
    if ( !visible)
      return;
    Graphics2D g = (Graphics2D) g1;
    float width = getWidth();
    float height = getHeight();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    if ( 45.0 <= rotate && rotate < 135.0) {
      g.translate( width, 0.0); 
      g.rotate( Math.PI * rotate/180, 0.0, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else if ( 135.0 <= rotate && rotate < 225.0)
    {
      g.rotate( Math.PI * rotate/180, width/2, height/2);
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    }
    else if ( 225.0 <= rotate && rotate < 315.0)
    {
      g.translate( -height, 0.0);
      g.rotate( Math.PI * rotate/180, height, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    if ( (dd.dynType & GeDyn.mDynType_Rotate) != 0 && dd.rotate != 0) {
      g.rotate( Math.PI * dd.rotate/180, 

           (dd.x0 - getX())*original_width/width,
           (dd.y0 - getY()) * original_height / height);
    }
    AffineTransform save = g.getTransform();
    AffineTransform save_tmp;
    int rounds = 1;
    if ( fillLevel != 1F)
      rounds = 2;
    int oldColor = 0;
    for ( int i = 0; i < rounds; i++) {
      if ( rounds == 2) {
        switch ( i) {
        case 0:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO) {
	    oldColor = colorTone;
	    colorTone = levelColorTone;
	  }
	  else if ( levelFillColor != GeColor.COLOR_NO) {
	    oldColor = fillColor;
	    fillColor = levelFillColor;
	  }
	  break;
        case 1:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO)
	    colorTone = oldColor;
	  else if ( levelFillColor != GeColor.COLOR_NO)
	    fillColor = oldColor;
	  break;
        }
        switch ( levelDirection) {
        case Ge.DIRECTION_UP:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,fillLevel*original_height+Ge.cJBean_Offset,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,fillLevel * original_height+Ge.cJBean_Offset));
	  break;
	case Ge.DIRECTION_DOWN:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,(1-fillLevel)*original_height+Ge.cJBean_Offset));
	  else
	    g.setClip(new Rectangle2D.Float(0F,(1-fillLevel)*original_height+Ge.cJBean_Offset,original_width,original_height));
	  break;
	case Ge.DIRECTION_RIGHT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(fillLevel*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,fillLevel*width+Ge.cJBean_Offset,height));
	  break;
	case Ge.DIRECTION_LEFT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,(1-fillLevel)*original_width+Ge.cJBean_Offset,original_height));
	  else
	    g.setClip(new Rectangle2D.Float((1-fillLevel)*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  break;
	}
      }
    g.setColor(GeColor.getColor(74, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[0]);
    {
    int fcolor = GeColor.getDrawtype(74, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[1]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[2]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[3]);
    }
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[0]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[4]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[5]);
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class pwr_burner extends GeComponent {
  // Dimension size;
  public pwr_burner( JopSession session)
  {
    super( session);
    size = new Dimension( 38, 14);
  }
  public int original_width = 38;
  public int original_height = 14;
  Shape[] shapes = new Shape[] { 
    new Polygon( new int[] { 5, 12, 25, 23, 32, 30, 37, 30, 32, 23, 25, 12, 5, 5}, new int[] {4, 2, 2, 4, 4, 5, 7, 9, 11, 11, 12, 12, 11, 4}, 14),
    new Polygon( new int[] { 5, 6, 12, 12}, new int[] { 4, 5, 3,2}, 4),
    new Polygon( new int[] { 12, 12, 23, 25}, new int[] { 2, 3, 3,2}, 4),
    new Polygon( new int[] { 25, 23, 21, 23}, new int[] { 2, 3, 5,4}, 4),
    new Polygon( new int[] { 23, 21, 28, 32}, new int[] { 4, 5, 5,4}, 4),
    new Polygon( new int[] { 32, 28, 27, 30}, new int[] { 4, 5, 5,5}, 4),
    new Polygon( new int[] { 30, 27, 33, 37}, new int[] { 5, 5, 7,7}, 4),
    new Polygon( new int[] { 37, 33, 28, 30}, new int[] { 7, 7, 9,9}, 4),
    new Polygon( new int[] { 30, 28, 30, 32}, new int[] { 9, 9, 10,11}, 4),
    new Polygon( new int[] { 32, 30, 19, 23}, new int[] { 11, 10, 10,11}, 4),
    new Polygon( new int[] { 23, 19, 21, 25}, new int[] { 11, 10, 11,12}, 4),
    new Polygon( new int[] { 25, 21, 12, 12}, new int[] { 12, 11, 11,12}, 4),
    new Polygon( new int[] { 12, 12, 6, 5}, new int[] { 12, 11, 10,11}, 4),
    new Polygon( new int[] { 5, 6, 6, 5}, new int[] { 11, 10, 5,4}, 4),
    new Polygon( new int[] { 6, 16, 32, 16, 6, 6}, new int[] {5, 4, 7, 11, 9, 5}, 6),
    new Rectangle2D.Float(2F, 2F, 3.48837F, 10.4651F),
    new Polygon( new int[] { 2, 5, 5, 3, 3, 2}, new int[] { 2, 2, 3, 3, 12, 12}, 6), 
    new Polygon( new int[] { 5, 5, 5, 5, 3, 2}, new int[] { 12, 2, 3, 12, 12, 12}, 6), 
  };
  public void paintComponent(Graphics g1) {
    animationCount = 1;
    if ( !visible)
      return;
    Graphics2D g = (Graphics2D) g1;
    float width = getWidth();
    float height = getHeight();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    if ( 45.0 <= rotate && rotate < 135.0) {
      g.translate( width, 0.0); 
      g.rotate( Math.PI * rotate/180, 0.0, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else if ( 135.0 <= rotate && rotate < 225.0)
    {
      g.rotate( Math.PI * rotate/180, width/2, height/2);
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    }
    else if ( 225.0 <= rotate && rotate < 315.0)
    {
      g.translate( -height, 0.0);
      g.rotate( Math.PI * rotate/180, height, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    if ( (dd.dynType & GeDyn.mDynType_Rotate) != 0 && dd.rotate != 0) {
      g.rotate( Math.PI * dd.rotate/180, 

           (dd.x0 - getX())*original_width/width,
           (dd.y0 - getY()) * original_height / height);
    }
    AffineTransform save = g.getTransform();
    AffineTransform save_tmp;
    int rounds = 1;
    if ( fillLevel != 1F)
      rounds = 2;
    int oldColor = 0;
    for ( int i = 0; i < rounds; i++) {
      if ( rounds == 2) {
        switch ( i) {
        case 0:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO) {
	    oldColor = colorTone;
	    colorTone = levelColorTone;
	  }
	  else if ( levelFillColor != GeColor.COLOR_NO) {
	    oldColor = fillColor;
	    fillColor = levelFillColor;
	  }
	  break;
        case 1:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO)
	    colorTone = oldColor;
	  else if ( levelFillColor != GeColor.COLOR_NO)
	    fillColor = oldColor;
	  break;
        }
        switch ( levelDirection) {
        case Ge.DIRECTION_UP:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,fillLevel*original_height+Ge.cJBean_Offset,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,fillLevel * original_height+Ge.cJBean_Offset));
	  break;
	case Ge.DIRECTION_DOWN:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,(1-fillLevel)*original_height+Ge.cJBean_Offset));
	  else
	    g.setClip(new Rectangle2D.Float(0F,(1-fillLevel)*original_height+Ge.cJBean_Offset,original_width,original_height));
	  break;
	case Ge.DIRECTION_RIGHT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(fillLevel*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,fillLevel*width+Ge.cJBean_Offset,height));
	  break;
	case Ge.DIRECTION_LEFT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,(1-fillLevel)*original_width+Ge.cJBean_Offset,original_height));
	  else
	    g.setClip(new Rectangle2D.Float((1-fillLevel)*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  break;
	}
      }
    g.setColor(GeColor.getColor(114, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[0]);
    {
    int fcolor = GeColor.getDrawtype(114, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[1]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[2]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[3]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[4]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[5]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[6]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[7]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[8]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[9]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[10]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[11]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[12]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[13]);
    }
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[0]);
    g.setColor(GeColor.getColor(145, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[14]);
    {
    int fcolor = GeColor.getDrawtype(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[15]);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[16]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[17]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[15]);
    }
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class pwr_valve extends GeComponent {
  // Dimension size;
  public pwr_valve( JopSession session)
  {
    super( session);
    size = new Dimension( 38, 21);
  }
  public int original_width = 38;
  public int original_height = 21;
  Shape[] shapes = new Shape[] { 
    new Polygon( new int[] { 2, 19, 2, 2}, new int[] {19, 11, 2, 19}, 4),
    new Polygon( new int[] { 2, 3, 17, 19}, new int[] { 19, 18, 11,11}, 4),
    new Polygon( new int[] { 19, 17, 3, 2}, new int[] { 11, 11, 4,2}, 4),
    new Polygon( new int[] { 2, 3, 3, 2}, new int[] { 2, 4, 18,19}, 4),
    new Polygon( new int[] { 37, 19, 37, 37}, new int[] {2, 11, 19, 2}, 4),
    new Polygon( new int[] { 37, 36, 21, 19}, new int[] { 2, 4, 11,11}, 4),
    new Polygon( new int[] { 19, 21, 36, 37}, new int[] { 11, 11, 18,19}, 4),
    new Polygon( new int[] { 37, 36, 36, 37}, new int[] { 19, 18, 4,2}, 4),
  };
  public void paintComponent(Graphics g1) {
    animationCount = 1;
    if ( !visible)
      return;
    Graphics2D g = (Graphics2D) g1;
    float width = getWidth();
    float height = getHeight();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    if ( 45.0 <= rotate && rotate < 135.0) {
      g.translate( width, 0.0); 
      g.rotate( Math.PI * rotate/180, 0.0, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else if ( 135.0 <= rotate && rotate < 225.0)
    {
      g.rotate( Math.PI * rotate/180, width/2, height/2);
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    }
    else if ( 225.0 <= rotate && rotate < 315.0)
    {
      g.translate( -height, 0.0);
      g.rotate( Math.PI * rotate/180, height, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    if ( (dd.dynType & GeDyn.mDynType_Rotate) != 0 && dd.rotate != 0) {
      g.rotate( Math.PI * dd.rotate/180, 

           (dd.x0 - getX())*original_width/width,
           (dd.y0 - getY()) * original_height / height);
    }
    AffineTransform save = g.getTransform();
    AffineTransform save_tmp;
    int rounds = 1;
    if ( fillLevel != 1F)
      rounds = 2;
    int oldColor = 0;
    for ( int i = 0; i < rounds; i++) {
      if ( rounds == 2) {
        switch ( i) {
        case 0:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO) {
	    oldColor = colorTone;
	    colorTone = levelColorTone;
	  }
	  else if ( levelFillColor != GeColor.COLOR_NO) {
	    oldColor = fillColor;
	    fillColor = levelFillColor;
	  }
	  break;
        case 1:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO)
	    colorTone = oldColor;
	  else if ( levelFillColor != GeColor.COLOR_NO)
	    fillColor = oldColor;
	  break;
        }
        switch ( levelDirection) {
        case Ge.DIRECTION_UP:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,fillLevel*original_height+Ge.cJBean_Offset,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,fillLevel * original_height+Ge.cJBean_Offset));
	  break;
	case Ge.DIRECTION_DOWN:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,(1-fillLevel)*original_height+Ge.cJBean_Offset));
	  else
	    g.setClip(new Rectangle2D.Float(0F,(1-fillLevel)*original_height+Ge.cJBean_Offset,original_width,original_height));
	  break;
	case Ge.DIRECTION_RIGHT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(fillLevel*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,fillLevel*width+Ge.cJBean_Offset,height));
	  break;
	case Ge.DIRECTION_LEFT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,(1-fillLevel)*original_width+Ge.cJBean_Offset,original_height));
	  else
	    g.setClip(new Rectangle2D.Float((1-fillLevel)*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  break;
	}
      }
    g.setColor(GeColor.getColor(74, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[0]);
    {
    int fcolor = GeColor.getDrawtype(74, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[1]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[2]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[3]);
    }
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[0]);
    g.setColor(GeColor.getColor(74, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[4]);
    {
    int fcolor = GeColor.getDrawtype(74, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[5]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[6]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[7]);
    }
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[4]);
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class pwr_indroundlarge extends GeComponent {
  // Dimension size;
  public pwr_indroundlarge( JopSession session)
  {
    super( session);
    size = new Dimension( 53, 54);
  }
  public int original_width = 53;
  public int original_height = 54;
  Shape[] shapes = new Shape[] { 
    new Arc2D.Float(2F, 2F, 49.7093F, 50.5814F, 0F, 360F, Arc2D.PIE),
    new Arc2D.Float(2F, 2F, 49.7093F, 50.5814F, 35F, 140F, Arc2D.PIE),
    new Arc2D.Float(2F, 2F, 49.7093F, 50.5814F, 215F, 140F, Arc2D.PIE),
    new Arc2D.Float(2F, 2F, 49.7093F, 50.5814F, -5F, 40F, Arc2D.PIE),
    new Arc2D.Float(2F, 2F, 49.7093F, 50.5814F, 175F, 40F, Arc2D.PIE),
    new Arc2D.Float(6.47384F, 6.47384F, 40.7616F, 41.6337F, 0F, 360F, Arc2D.PIE),
    new Arc2D.Float(2F, 2F, 49.7093F, 50.5814F, 0F, 360F, Arc2D.PIE),
    new Polygon( new int[] { 5, 3, 8, 16, 28, 34, 21, 12, 8, 8}, new int[] {22, 30, 40, 47, 49, 46, 42, 34, 24, 16}, 10),
    new Polygon( new int[] { 32, 31, 35, 42, 34}, new int[] {11, 15, 19, 16, 10}, 5),
  };
  public void paintComponent(Graphics g1) {
    animationCount = 1;
    if ( !visible)
      return;
    Graphics2D g = (Graphics2D) g1;
    float width = getWidth();
    float height = getHeight();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    if ( 45.0 <= rotate && rotate < 135.0) {
      g.translate( width, 0.0); 
      g.rotate( Math.PI * rotate/180, 0.0, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else if ( 135.0 <= rotate && rotate < 225.0)
    {
      g.rotate( Math.PI * rotate/180, width/2, height/2);
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    }
    else if ( 225.0 <= rotate && rotate < 315.0)
    {
      g.translate( -height, 0.0);
      g.rotate( Math.PI * rotate/180, height, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    if ( (dd.dynType & GeDyn.mDynType_Rotate) != 0 && dd.rotate != 0) {
      g.rotate( Math.PI * dd.rotate/180, 

           (dd.x0 - getX())*original_width/width,
           (dd.y0 - getY()) * original_height / height);
    }
    AffineTransform save = g.getTransform();
    AffineTransform save_tmp;
    int rounds = 1;
    if ( fillLevel != 1F)
      rounds = 2;
    int oldColor = 0;
    for ( int i = 0; i < rounds; i++) {
      if ( rounds == 2) {
        switch ( i) {
        case 0:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO) {
	    oldColor = colorTone;
	    colorTone = levelColorTone;
	  }
	  else if ( levelFillColor != GeColor.COLOR_NO) {
	    oldColor = fillColor;
	    fillColor = levelFillColor;
	  }
	  break;
        case 1:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO)
	    colorTone = oldColor;
	  else if ( levelFillColor != GeColor.COLOR_NO)
	    fillColor = oldColor;
	  break;
        }
        switch ( levelDirection) {
        case Ge.DIRECTION_UP:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,fillLevel*original_height+Ge.cJBean_Offset,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,fillLevel * original_height+Ge.cJBean_Offset));
	  break;
	case Ge.DIRECTION_DOWN:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,(1-fillLevel)*original_height+Ge.cJBean_Offset));
	  else
	    g.setClip(new Rectangle2D.Float(0F,(1-fillLevel)*original_height+Ge.cJBean_Offset,original_width,original_height));
	  break;
	case Ge.DIRECTION_RIGHT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(fillLevel*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,fillLevel*width+Ge.cJBean_Offset,height));
	  break;
	case Ge.DIRECTION_LEFT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,(1-fillLevel)*original_width+Ge.cJBean_Offset,original_height));
	  else
	    g.setClip(new Rectangle2D.Float((1-fillLevel)*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  break;
	}
      }
    if ( shadow == 0) {
    ((Arc2D)shapes[0]).setArcType(Arc2D.PIE);
    g.setColor(GeColor.getColor(293, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[0]);
    ((Arc2D)shapes[0]).setArcType(Arc2D.OPEN);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[0]);
    } else {
    ((Arc2D)shapes[1]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes[2]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes[3]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes[4]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes[5]).setArcType(Arc2D.PIE);
    {
    int fcolor = GeColor.getDrawtype(293, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[1]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[2]);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[3]);
    g.fill( shapes[4]);
    g.fill( shapes[5]);
    }
    ((Arc2D)shapes[6]).setArcType(Arc2D.OPEN);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[6]);
    }
    g.setColor(GeColor.getColor(295, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[7]);
    g.setColor(GeColor.getColor(281, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[8]);
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
  public int getUtilityType() {
    return JopUtility.GRAPH;
  }
  public PwrtObjid getUtilityObjid() {
    return utilityAref.getObjid();
  }
  public PwrtAttrRef getUtilityAttrRef() {
    return utilityAref;
  }
  public String getUtilityName() {
    return this.getClass().getName();
  }
}
