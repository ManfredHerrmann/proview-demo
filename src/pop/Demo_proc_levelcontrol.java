import jpwr.rt.*;
import jpwr.jop.*;
import jpwr.jopc.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.awt.font.*;
import javax.swing.*;
import java.awt.event.*;

public class Demo_proc_levelcontrol extends JopFrame implements JopUtilityIfc {
  JPanel contentPane;
  BorderLayout borderLayout1 = new BorderLayout();
  public LocalPanel localPanel = new LocalPanel();
  boolean scrollbar = false;
  Dimension size;
  pwr_sliderbackground3	pwr_sliderbackground34;
  pwr_logga	pwr_logga7;
  JopSmallbutton	jopSmallbutton10;
  JopSmallbutton	jopSmallbutton11;
  pwr_buttoninfo	pwr_buttoninfo12;
  help_button	help_button14;
  bcomp_pumpaggr	bcomp_pumpaggr16;
  bcomp_levelsensor	bcomp_levelsensor17;
  pwr_pidcontroller	pwr_pidcontroller18;
  bcomp_mvalve	bcomp_mvalve19;
  pwr_valueinputmediumrd	pwr_valueinputmediumrd20;
  pwr_valuemedium	pwr_valuemedium21;
  JopSmallbutton	jopSmallbutton22;
  JopSmallbutton	jopSmallbutton23;
  pwr_valuemedium	pwr_valuemedium24;
  JopTrend	jopTrend25;
  JopAxis	jopAxis27;
  bcomp_cvalve	bcomp_cvalve29;
  pwr_slider3	pwr_slider330;
  Grp59_	grp59_31;
  public Demo_proc_levelcontrol( JopSession session, String instance, boolean scrollbar) {
    super( session, instance);
    this.scrollbar = scrollbar;
    geInit();
  }
  public Demo_proc_levelcontrol( JopSession session, String instance, boolean scrollbar, boolean noinit) {
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
      this.setTitle("Demo_proc_levelcontrol");
    pwr_sliderbackground34 = new pwr_sliderbackground3(session);
    pwr_sliderbackground34.setBounds(new Rectangle(183,132,56,190));
    pwr_sliderbackground34.setFillColor(32);
    localPanel.add(pwr_sliderbackground34, new Proportion(pwr_sliderbackground34.getBounds(), dsize));
    pwr_logga7 = new pwr_logga(session);
    pwr_logga7.setBounds(new Rectangle(522,6,71,49));
    localPanel.add(pwr_logga7, new Proportion(pwr_logga7.getBounds(), dsize));
    jopSmallbutton10 = new JopSmallbutton(session);
    jopSmallbutton10.setBounds(new Rectangle(367,9,70,18));
    jopSmallbutton10.setFillColor(31);
    jopSmallbutton10.setBorderColor(37);
    jopSmallbutton10.setTextColor(37);
    localPanel.add(jopSmallbutton10, new Proportion(jopSmallbutton10.getBounds(), dsize));
    jopSmallbutton11 = new JopSmallbutton(session);
    jopSmallbutton11.setBounds(new Rectangle(442,9,70,18));
    jopSmallbutton11.setFillColor(31);
    localPanel.add(jopSmallbutton11, new Proportion(jopSmallbutton11.getBounds(), dsize));
    pwr_buttoninfo12 = new pwr_buttoninfo(session);
    pwr_buttoninfo12.setBounds(new Rectangle(331,9,24,25));
    localPanel.add(pwr_buttoninfo12, new Proportion(pwr_buttoninfo12.getBounds(), dsize));
    help_button14 = new help_button(session);
    help_button14.setBounds(new Rectangle(305,9,25,25));
    localPanel.add(help_button14, new Proportion(help_button14.getBounds(), dsize));
    bcomp_pumpaggr16 = new bcomp_pumpaggr(session);
    bcomp_pumpaggr16.setBounds(new Rectangle(357,279,56,38));
    bcomp_pumpaggr16.setFillColor(223);
    bcomp_pumpaggr16.setRotate(-540);
    bcomp_pumpaggr16.setShadow(1);
    localPanel.add(bcomp_pumpaggr16, new Proportion(bcomp_pumpaggr16.getBounds(), dsize));
    bcomp_levelsensor17 = new bcomp_levelsensor(session);
    bcomp_levelsensor17.setBounds(new Rectangle(183,104,21,21));
    bcomp_levelsensor17.setFillColor(223);
    bcomp_levelsensor17.setShadow(1);
    localPanel.add(bcomp_levelsensor17, new Proportion(bcomp_levelsensor17.getBounds(), dsize));
    pwr_pidcontroller18 = new pwr_pidcontroller(session);
    pwr_pidcontroller18.setBounds(new Rectangle(218,69,38,38));
    pwr_pidcontroller18.setFillColor(32);
    pwr_pidcontroller18.setShadow(1);
    localPanel.add(pwr_pidcontroller18, new Proportion(pwr_pidcontroller18.getBounds(), dsize));
    bcomp_mvalve19 = new bcomp_mvalve(session);
    bcomp_mvalve19.setBounds(new Rectangle(88,322,38,56));
    bcomp_mvalve19.setFillColor(223);
    bcomp_mvalve19.setRotate(-90);
    bcomp_mvalve19.setShadow(1);
    localPanel.add(bcomp_mvalve19, new Proportion(bcomp_mvalve19.getBounds(), dsize));
    pwr_valueinputmediumrd20 = new pwr_valueinputmediumrd(session);
    pwr_valueinputmediumrd20.setBounds(new Rectangle(101,68,61,26));
    pwr_valueinputmediumrd20.setShadow(1);
    localPanel.add(pwr_valueinputmediumrd20, new Proportion(pwr_valueinputmediumrd20.getBounds(), dsize));
    pwr_valuemedium21 = new pwr_valuemedium(session);
    pwr_valuemedium21.setBounds(new Rectangle(103,100,56,21));
    localPanel.add(pwr_valuemedium21, new Proportion(pwr_valuemedium21.getBounds(), dsize));
    jopSmallbutton22 = new JopSmallbutton(session);
    jopSmallbutton22.setBounds(new Rectangle(368,71,70,18));
    jopSmallbutton22.setFillColor(31);
    localPanel.add(jopSmallbutton22, new Proportion(jopSmallbutton22.getBounds(), dsize));
    jopSmallbutton23 = new JopSmallbutton(session);
    jopSmallbutton23.setBounds(new Rectangle(444,71,70,18));
    jopSmallbutton23.setFillColor(31);
    localPanel.add(jopSmallbutton23, new Proportion(jopSmallbutton23.getBounds(), dsize));
    pwr_valuemedium24 = new pwr_valuemedium(session);
    pwr_valuemedium24.setBounds(new Rectangle(288,310,37,21));
    localPanel.add(pwr_valuemedium24, new Proportion(pwr_valuemedium24.getBounds(), dsize));
    jopTrend25 = new JopTrend( session);
    jopTrend25.setBounds(new Rectangle(324,136,267,125));
    jopTrend25.setFillColor(39);
    jopTrend25.setBorderColor(36);
    jopTrend25.setBorderColorTrend1(144);
    jopTrend25.setBorderColorTrend2(294);
    jopTrend25.setFillColorTrend1(138);
    jopTrend25.setFillColorTrend2(288);
    jopTrend25.setDrawFill(1);
    jopTrend25.setDrawBorder(1);
    jopTrend25.setTrendBorderWidth(1);
    jopTrend25.setLineWidth(1);
    jopTrend25.setMinValue1(0F);
    jopTrend25.setMaxValue1(1F);
    jopTrend25.setMinValue2(0F);
    jopTrend25.setMaxValue2(1F);
    jopTrend25.setNoOfPoints(100);
    jopTrend25.setHorizontalLines(4);
    jopTrend25.setVerticalLines(4);
    jopTrend25.setRotate(0);
    localPanel.add(jopTrend25, new Proportion(jopTrend25.getBounds(), dsize));
    jopAxis27 = new JopAxis();
    jopAxis27.setBounds(new Rectangle(237,135,21,184));
    jopAxis27.setBorderColor(0);
    jopAxis27.setTextColor(0);
    jopAxis27.setLineWidth(1);
    jopAxis27.setMinValue(1F);
    jopAxis27.setMaxValue(0F);
    jopAxis27.setLines(51);
    jopAxis27.setLongQuotient(5);
    jopAxis27.setValueQuotient(5);
    jopAxis27.setLineLength(9);
    jopAxis27.setLineWidth(1);
    jopAxis27.setRotate(180);
    jopAxis27.setFont(new Font("Helvetica", Font.PLAIN, 8));
    jopAxis27.setFormat("%3.1f");
    localPanel.add(jopAxis27, new Proportion(jopAxis27.getBounds(), dsize));
    bcomp_cvalve29 = new bcomp_cvalve(session);
    bcomp_cvalve29.setBounds(new Rectangle(287,270,58,38));
    bcomp_cvalve29.setFillColor(223);
    bcomp_cvalve29.setShadow(1);
    localPanel.add(bcomp_cvalve29, new Proportion(bcomp_cvalve29.getBounds(), dsize));
    pwr_slider330 = new pwr_slider3(session);
    pwr_slider330.setBounds(new Rectangle(183,193,56,12));
    localPanel.add(pwr_slider330, new Proportion(pwr_slider330.getBounds(), dsize));
    grp59_31 = new Grp59_(session);
    grp59_31.setBounds(new Rectangle(113,130,101,190));
    localPanel.add(grp59_31, new Proportion(grp59_31.getBounds(), dsize));
    pwr_sliderbackground34.dd.setDynType(524289);
    pwr_sliderbackground34.dd.setActionType(0);
    pwr_logga7.dd.setDynType(1);
    pwr_logga7.dd.setActionType(0);
    jopSmallbutton10.dd.setDynType(1);
    jopSmallbutton10.dd.setActionType(0);
    jopSmallbutton10.setAnnot1(" Previous");
    jopSmallbutton11.dd.setDynType(1);
    jopSmallbutton11.dd.setActionType(64);
    jopSmallbutton11.dd.setAccess(33619967);
    jopSmallbutton11.dd.setElements(new GeDynElemIfc[] {
      new GeDynCommand(jopSmallbutton11.dd, "set subwindow pwrdemo/name=main/source=\"demo_comp_baselevelsensor\"")
      });
    jopSmallbutton11.setAnnot1("   Next");
    pwr_buttoninfo12.dd.setDynType(1);
    pwr_buttoninfo12.dd.setActionType(16384);
    pwr_buttoninfo12.dd.setAccess(33619967);
    pwr_buttoninfo12.dd.setElements(new GeDynElemIfc[] {
      new GeDynCommand(pwr_buttoninfo12.dd, "help BaseTempSensor /helpfile=\"$pwr_lang/basecomponent_xtthelp.dat\"")
      });
    help_button14.dd.setDynType(1);
    help_button14.dd.setActionType(16384);
    help_button14.dd.setAccess(33619967);
    help_button14.dd.setElements(new GeDynElemIfc[] {
      new GeDynCommand(help_button14.dd, "help Comp_BaseTempSensor")
      });
    bcomp_pumpaggr16.dd.setDynType(67108865);
    bcomp_pumpaggr16.dd.setActionType(64);
    bcomp_pumpaggr16.dd.setAccess(33619964);
    bcomp_pumpaggr16.dd.setElements(new GeDynElemIfc[] {
      new GeDynHostObject(bcomp_pumpaggr16.dd, "Demo-Process-LevelControl-P1")
      ,new GeDynDigError(bcomp_pumpaggr16.dd, "$hostobject.IndError##Boolean")
      ,new GeDynDigWarning(bcomp_pumpaggr16.dd, "$hostobject.IndWarning##Boolean")
      ,new GeDynDigLowColor(bcomp_pumpaggr16.dd, "$hostobject.Contactor.IndFeedback##Boolean",37)
      ,new GeDynValue(bcomp_pumpaggr16.dd, "$hostobject.Mode.IndMode##String8","%s")
      ,new GeDynDigShift(bcomp_pumpaggr16.dd, "$hostobject.Contactor.IndFeedback##Boolean")
      ,new GeDynPopupMenu(bcomp_pumpaggr16.dd, "$hostobject")
      ,new GeDynCommand(bcomp_pumpaggr16.dd, "open graph/class/inst=Demo-Process-LevelControl-P1")
      });
    bcomp_levelsensor17.dd.setDynType(67108865);
    bcomp_levelsensor17.dd.setActionType(64);
    bcomp_levelsensor17.dd.setAccess(33619964);
    bcomp_levelsensor17.dd.setElements(new GeDynElemIfc[] {
      new GeDynHostObject(bcomp_levelsensor17.dd, "Demo-Process-LevelControl-LC1")
      ,new GeDynDigFlash(bcomp_levelsensor17.dd, "$hostobject.IndError##Boolean",29,9999)
      ,new GeDynDigError(bcomp_levelsensor17.dd, "$hostobject.IndError##Boolean")
      ,new GeDynDigWarning(bcomp_levelsensor17.dd, "$hostobject.IndWarning##Boolean")
      ,new GeDynPopupMenu(bcomp_levelsensor17.dd, "$hostobject")
      ,new GeDynCommand(bcomp_levelsensor17.dd, "open graph/class/inst=Demo-Process-LevelControl-LC1")
      });
    pwr_pidcontroller18.dd.setDynType(1);
    pwr_pidcontroller18.dd.setActionType(64);
    pwr_pidcontroller18.dd.setAccess(33619964);
    pwr_pidcontroller18.dd.setElements(new GeDynElemIfc[] {
      new GeDynCommand(pwr_pidcontroller18.dd, "open graph/class/inst=Demo-Process-LevelControl-Plc-W-LC1_Mode")
      });
    pwr_pidcontroller18.setAnnot1("LC1");
    bcomp_mvalve19.dd.setDynType(67108865);
    bcomp_mvalve19.dd.setActionType(64);
    bcomp_mvalve19.dd.setAccess(33619964);
    bcomp_mvalve19.dd.setElements(new GeDynElemIfc[] {
      new GeDynHostObject(bcomp_mvalve19.dd, "Demo-Process-LevelControl-MV1")
      ,new GeDynDigFlash(bcomp_mvalve19.dd, "$hostobject.IndError##Boolean",176,29)
      ,new GeDynDigWarning(bcomp_mvalve19.dd, "$hostobject.IndWarning##Boolean")
      ,new GeDynAnalogColor(bcomp_mvalve19.dd, "",1,4,30)
      ,new GeDynAnalogColor(bcomp_mvalve19.dd, "$hostobject.PosEnum##Int32",0,4,35)
      ,new GeDynValue(bcomp_mvalve19.dd, "$hostobject.Mode.IndMode##String8","%s")
      ,new GeDynPopupMenu(bcomp_mvalve19.dd, "$hostobject")
      ,new GeDynCommand(bcomp_mvalve19.dd, "open graph/class/inst=Demo-Process-LevelControl-MV1")
      });
    pwr_valueinputmediumrd20.dd.setDynType(1025);
    pwr_valueinputmediumrd20.dd.setActionType(4096);
    pwr_valueinputmediumrd20.dd.setAccess(33619964);
    pwr_valueinputmediumrd20.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valueinputmediumrd20.dd, "Demo-Process-LevelControl-Plc-W-LC1_Mode.SetVal##Float32","%5.2f")
      ,new GeDynValueInput(pwr_valueinputmediumrd20.dd, 0,1,null,null)
      });
    pwr_valuemedium21.dd.setDynType(1025);
    pwr_valuemedium21.dd.setActionType(0);
    pwr_valuemedium21.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuemedium21.dd, "Demo-Process-LevelControl-LC1.Value.ActualValue##Float32","%5.2f")
      });
    jopSmallbutton22.dd.setDynType(1);
    jopSmallbutton22.dd.setActionType(4);
    jopSmallbutton22.dd.setAccess(33619967);
    jopSmallbutton22.dd.setElements(new GeDynElemIfc[] {
      new GeDynSetDig(jopSmallbutton22.dd, "Demo-Process-LevelControl-Start.ActualValue##Boolean")
      });
    jopSmallbutton22.setAnnot1("   Start");
    jopSmallbutton23.dd.setDynType(1);
    jopSmallbutton23.dd.setActionType(4);
    jopSmallbutton23.dd.setAccess(33619967);
    jopSmallbutton23.dd.setElements(new GeDynElemIfc[] {
      new GeDynSetDig(jopSmallbutton23.dd, "Demo-Process-LevelControl-Stop.ActualValue##Boolean")
      });
    jopSmallbutton23.setAnnot1("   Stop");
    pwr_valuemedium24.dd.setDynType(1025);
    pwr_valuemedium24.dd.setActionType(0);
    pwr_valuemedium24.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuemedium24.dd, "Demo-Process-LevelControl-CV1.Actuator.Order.ActualValue##Float32","%4.1f")
      });
    jopTrend25.setPwrAttribute1("Demo-Process-LevelControl-LC1.Value.ActualValue##Float32");
    jopTrend25.setPwrAttribute2("Demo-Process-LevelControl-Plc-W-LC1_Mode.SetVal##Float32");
    bcomp_cvalve29.dd.setDynType(67108865);
    bcomp_cvalve29.dd.setActionType(64);
    bcomp_cvalve29.dd.setAccess(33619964);
    bcomp_cvalve29.dd.setElements(new GeDynElemIfc[] {
      new GeDynHostObject(bcomp_cvalve29.dd, "Demo-Process-LevelControl-CV1")
      ,new GeDynDigFlash(bcomp_cvalve29.dd, "$hostobject.Actuator.IndError##Boolean",176,29)
      ,new GeDynDigWarning(bcomp_cvalve29.dd, "$hostobject.Actuator.IndWarning##Boolean")
      ,new GeDynAnalogColor(bcomp_cvalve29.dd, "$hostobject.Actuator.PosEnum##Int32",1,4,30)
      ,new GeDynValue(bcomp_cvalve29.dd, "$hostobject.Actuator.Mode.IndMode##String8","%s")
      ,new GeDynPopupMenu(bcomp_cvalve29.dd, "$hostobject")
      ,new GeDynCommand(bcomp_cvalve29.dd, "open graph/class/inst=Demo-Process-LevelControl-CV1")
      });
    pwr_slider330.dd.setDynType(1);
    pwr_slider330.dd.setActionType(2048);
    pwr_slider330.dd.setAccess(33619964);
    pwr_slider330.dd.setElements(new GeDynElemIfc[] {
      new GeDynSlider(pwr_slider330.dd, "Demo-Process-LevelControl-Plc-W-LC1_Mode.SetVal##Float32",0,1,4,127.874,314.379,null,null,
null)
      });
    grp59_31.dd.setDynType(2097153);
    grp59_31.dd.setActionType(0);
    grp59_31.dd.setElements(new GeDynElemIfc[] {
      new GeDynFillLevel(grp59_31.dd, "Demo-Process-LevelControl-LC1.Value.ActualValue##Float32",30,4,0,1,0,0,null,null)
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
    new Polygon( new int[] { 323, 449, 458, 462, 462, 455, 455, 453, 449, 323, 323}, new int[] {295, 295, 300, 312, 403, 403, 312, 305, 302, 302, 295}, 11),
    new Polygon( new int[] { 323, 325, 448, 449}, new int[] { 295, 297, 297,295}, 4),
    new Polygon( new int[] { 449, 448, 456, 458}, new int[] { 295, 297, 301,300}, 4),
    new Polygon( new int[] { 458, 456, 460, 462}, new int[] { 300, 301, 312,312}, 4),
    new Polygon( new int[] { 462, 460, 460, 462}, new int[] { 312, 312, 401,403}, 4),
    new Polygon( new int[] { 462, 460, 457, 455}, new int[] { 403, 401, 401,403}, 4),
    new Polygon( new int[] { 455, 457, 457, 455}, new int[] { 403, 401, 312,312}, 4),
    new Polygon( new int[] { 455, 457, 455, 453}, new int[] { 312, 312, 304,305}, 4),
    new Polygon( new int[] { 453, 455, 450, 449}, new int[] { 305, 304, 300,302}, 4),
    new Polygon( new int[] { 449, 450, 325, 323}, new int[] { 302, 300, 300,302}, 4),
    new Polygon( new int[] { 323, 325, 325, 323}, new int[] { 302, 300, 297,295}, 4),
    new Rectangle2D.Float(115.372F, 371.767F, 3.48837F, 26.1628F),
    new Polygon( new int[] { 115, 119, 118, 116, 116, 115}, new int[] { 372, 372, 373, 373, 397, 398}, 6), 
    new Polygon( new int[] { 119, 119, 118, 118, 116, 115}, new int[] { 398, 372, 373, 397, 397, 398}, 6), 
    new Polygon( new int[] { 134, 124, 118, 115, 115, 119, 119, 120, 124, 135, 135}, new int[] {314, 314, 317, 323, 346, 346, 325, 319, 318, 318, 314}, 11),
    new Polygon( new int[] { 134, 134, 124, 124}, new int[] { 314, 315, 315,314}, 4),
    new Polygon( new int[] { 124, 124, 119, 118}, new int[] { 314, 315, 318,317}, 4),
    new Polygon( new int[] { 118, 119, 116, 115}, new int[] { 317, 318, 323,323}, 4),
    new Polygon( new int[] { 115, 116, 116, 115}, new int[] { 323, 323, 345,346}, 4),
    new Polygon( new int[] { 115, 116, 118, 119}, new int[] { 346, 345, 345,346}, 4),
    new Polygon( new int[] { 119, 118, 118, 119}, new int[] { 346, 345, 325,325}, 4),
    new Polygon( new int[] { 119, 118, 119, 120}, new int[] { 325, 325, 318,319}, 4),
    new Polygon( new int[] { 120, 119, 124, 124}, new int[] { 319, 318, 317,318}, 4),
    new Polygon( new int[] { 124, 124, 134, 135}, new int[] { 318, 317, 317,318}, 4),
    new Polygon( new int[] { 135, 134, 134, 135}, new int[] { 318, 317, 315,314}, 4),
    new Polygon( new int[] { 143, 89, 83, 80, 80, 84, 84, 85, 89, 143, 143}, new int[] {140, 140, 142, 149, 401, 401, 150, 145, 143, 143, 140}, 11),
    new Polygon( new int[] { 143, 142, 89, 89}, new int[] { 140, 141, 141,140}, 4),
    new Polygon( new int[] { 89, 89, 84, 83}, new int[] { 140, 141, 143,142}, 4),
    new Polygon( new int[] { 83, 84, 81, 80}, new int[] { 142, 143, 149,149}, 4),
    new Polygon( new int[] { 80, 81, 81, 80}, new int[] { 149, 149, 400,401}, 4),
    new Polygon( new int[] { 80, 81, 83, 84}, new int[] { 401, 400, 400,401}, 4),
    new Polygon( new int[] { 84, 83, 83, 84}, new int[] { 401, 400, 150,150}, 4),
    new Polygon( new int[] { 84, 83, 84, 85}, new int[] { 150, 150, 144,145}, 4),
    new Polygon( new int[] { 85, 84, 89, 89}, new int[] { 145, 144, 142,143}, 4),
    new Polygon( new int[] { 89, 89, 142, 143}, new int[] { 143, 142, 142,143}, 4),
    new Polygon( new int[] { 143, 142, 142, 143}, new int[] { 143, 142, 141,140}, 4),
    new Line2D.Float( 80F, 394F, 80F, 403F),
    new Line2D.Float( 80F, 403F, 80F, 412F),
    new Line2D.Float( 72F, 403F, 80F, 403F),
    new Line2D.Float( 80F, 403F, 89F, 403F),
    new Line2D.Float( 150F, 133F, 150F, 142F),
    new Line2D.Float( 150F, 142F, 150F, 150F),
    new Line2D.Float( 142F, 142F, 150F, 142F),
    new Line2D.Float( 150F, 142F, 159F, 142F),
    new Line2D.Float( 612.465F, 54.3256F, 2F, 54.3256F),
    new RoundRectangle2D.Float(63.0465F, 394.442F, 417.733F, 96.8023F, 29.0407F, 29.0407F),
    new Rectangle2D.Float(77.5669F, 394.442F, 388.692F, 4.84012F),
    new Rectangle2D.Float(63.0465F, 408.962F, 4.84012F, 67.7616F),
    new Arc2D.Float(63.0465F, 394.442F, 29.0407F, 29.0407F, 90F, 90F, Arc2D.PIE),
    new Arc2D.Float(451.738F, 394.442F, 29.0407F, 29.0407F, 45F, 45F, Arc2D.PIE),
    new Arc2D.Float(63.0465F, 462.203F, 29.0407F, 29.0407F, 180F, 45F, Arc2D.PIE),
    new Rectangle2D.Float(77.5669F, 486.404F, 388.692F, 4.84012F),
    new Rectangle2D.Float(475.939F, 408.962F, 4.84012F, 67.7616F),
    new Arc2D.Float(451.738F, 462.203F, 29.0407F, 29.0407F, 270F, 90F, Arc2D.PIE),
    new Arc2D.Float(451.738F, 394.442F, 29.0407F, 29.0407F, 0F, 45F, Arc2D.PIE),
    new Arc2D.Float(63.0465F, 462.203F, 29.0407F, 29.0407F, 225F, 45F, Arc2D.PIE),
    new RoundRectangle2D.Float(67.8866F, 399.282F, 408.052F, 87.1221F, 19.3605F, 19.3605F),
    new RoundRectangle2D.Float(63.0465F, 394.442F, 417.733F, 96.8023F, 29.0407F, 29.0407F),
    new Rectangle2D.Float(321.186F, 133.686F, 273.791F, 127.278F),
    new Polygon( new int[] { 321, 595, 590, 326, 326, 321}, new int[] { 134, 134, 139, 139, 256, 261}, 6), 
    new Polygon( new int[] { 595, 595, 590, 590, 326, 321}, new int[] { 261, 134, 139, 256, 256, 261}, 6), 
    new Rectangle2D.Float(204.326F, 295.023F, 90.6977F, 6.97674F),
    new Polygon( new int[] { 204, 295, 294, 206, 206, 204}, new int[] { 295, 295, 296, 296, 301, 302}, 6), 
    new Polygon( new int[] { 295, 295, 294, 294, 206, 204}, new int[] { 302, 295, 296, 301, 301, 302}, 6), 
    new Line2D.Float( 193.86F, 167.698F, 193.86F, 124.093F),
    new Line2D.Float( 220.023F, 81.3605F, 175.547F, 81.3605F),
    new Polygon( new int[] { 220, 194, 194, 194}, new int[] {97, 97, 107, 97}, 4),
    new Polygon( new int[] { 253, 306, 306, 306}, new int[] {89, 89, 273, 89}, 4),
    new Polygon( new int[] { 253, 257, 303, 306}, new int[] { 89, 92, 92,89}, 4),
    new Polygon( new int[] { 306, 303, 303, 306}, new int[] { 89, 92, 252,273}, 4),
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
    g.setColor(GeColor.getColor(223, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[0]);
    {
    int fcolor = GeColor.getDrawtype(223, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[1]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[2]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[3]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[4]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[5]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[6]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[7]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[8]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[9]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[10]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[0]);
    {
    int fcolor = GeColor.getDrawtype(223, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[11]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[12]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[13]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[11]);
    }
    g.setColor(GeColor.getColor(223, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[14]);
    {
    int fcolor = GeColor.getDrawtype(223, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[15]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[16]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[17]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[18]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[19]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[20]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[21]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[22]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[23]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[24]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[14]);
    g.setColor(GeColor.getColor(223, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[25]);
    {
    int fcolor = GeColor.getDrawtype(223, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[26]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[27]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[28]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[29]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[30]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
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
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[25]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[36]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[37]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[38]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
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
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[43]);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.BOLD, 12));
    g.drawString( "Process",9, 16);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.BOLD, 18));
    g.drawString( "LevelControl",8, 43);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[44]);
    {
    int fcolor = GeColor.getDrawtype(223, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[50]);
    g.fill( shapes[49]);
    g.fill( shapes[48]);
    g.fill( shapes[47]);
    g.fill( shapes[46]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[55]);
    g.fill( shapes[54]);
    g.fill( shapes[53]);
    g.fill( shapes[52]);
    g.fill( shapes[51]);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[56]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[57]);
    {
    int fcolor = GeColor.getDrawtype(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[59]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[60]);
    }
    {
    int fcolor = GeColor.getDrawtype(223, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[61]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[62]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[63]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[61]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[64]);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.BOLD, 10));
    g.drawString( "SetValue",54, 85);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.BOLD, 10));
    g.drawString( "Level",54, 114);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "m",163, 85);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "m",163, 114);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "%",328, 325);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[65]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[66]);
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[68]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[69]);
    }
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[67]);
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
    new Polygon( new int[] { 12, 18, 19, 19}, new int[] { 2, 5, 5,2}, 4),
    new Polygon( new int[] { 19, 19, 33, 33}, new int[] { 2, 5, 10,8}, 4),
    new Polygon( new int[] { 33, 33, 40, 39}, new int[] { 8, 10, 6,4}, 4),
    new Polygon( new int[] { 39, 40, 55, 56}, new int[] { 4, 6, 6,4}, 4),
    new Polygon( new int[] { 56, 55, 61, 61}, new int[] { 4, 6, 10,8}, 4),
    new Polygon( new int[] { 61, 61, 75, 75}, new int[] { 8, 10, 5,2}, 4),
    new Polygon( new int[] { 75, 75, 74, 80}, new int[] { 2, 5, 5,2}, 4),
    new Polygon( new int[] { 80, 74, 49, 51}, new int[] { 2, 5, 26,27}, 4),
    new Polygon( new int[] { 51, 49, 47, 47}, new int[] { 27, 26, 30,34}, 4),
    new Polygon( new int[] { 47, 47, 46, 44}, new int[] { 34, 30, 26,27}, 4),
    new Polygon( new int[] { 44, 46, 18, 12}, new int[] { 27, 26, 5,2}, 4),
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
    new Polygon( new int[] { 19, 63, 62, 21, 21, 19}, new int[] { 16, 16, 17, 17, 56, 58}, 6), 
    new Polygon( new int[] { 63, 63, 62, 62, 21, 19}, new int[] { 58, 16, 17, 56, 56, 58}, 6), 
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
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[4]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[5]);
    }
    }
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[6]);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[7]);
    {
    int fcolor = GeColor.getDrawtype(230, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[8]);
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
protected class bcomp_pumpaggr extends GeComponent {
  // Dimension size;
  public bcomp_pumpaggr( JopSession session)
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
    new Polygon( new int[] { 7, 32, 19, 7}, new int[] {12, 12, 33, 13}, 4),
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
    new Polygon( new int[] { 12, 12, 33, 13}, new int[] {32, 7, 19, 32}, 4),
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
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.fill( shapes[8]);
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
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.fill( shapes_p2[8]);
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class bcomp_cvalve extends GeComponent {
  // Dimension size;
  public bcomp_cvalve( JopSession session)
  {
    super( session);
    size = new Dimension( 58, 38);
    annot1Font = new Font("Helvetica", Font.BOLD, 12);
  }
  int annot1Color = 0;
  public String getAnnot1() { return annot1;}
  public void setAnnot1( String s) { annot1 = s;}
  public void setAnnot1Font( Font font) { annot1Font = font;}
  public Font getAnnot1Font() { return annot1Font;}
  public void setAnnot1Color( int color) { annot1Color = color;}
  public int original_width = 58;
  public int original_height = 38;
  Shape[] shapes = new Shape[] { 
    new Polygon( new int[] { 2, 2, 19, 2}, new int[] {19, 37, 28, 19}, 4),
    new Polygon( new int[] { 2, 3, 3, 2}, new int[] { 19, 22, 35,37}, 4),
    new Polygon( new int[] { 2, 3, 17, 19}, new int[] { 37, 35, 28,28}, 4),
    new Polygon( new int[] { 19, 17, 3, 2}, new int[] { 28, 28, 22,19}, 4),
    new Polygon( new int[] { 37, 37, 19, 37}, new int[] {19, 37, 28, 19}, 4),
    new Polygon( new int[] { 37, 36, 36, 37}, new int[] { 19, 22, 35,37}, 4),
    new Polygon( new int[] { 37, 36, 21, 19}, new int[] { 37, 35, 28,28}, 4),
    new Polygon( new int[] { 19, 21, 36, 37}, new int[] { 28, 28, 22,19}, 4),
    new Arc2D.Float(10.7209F, 2F, 17.4419F, 17.4419F, 0F, 360F, Arc2D.PIE),
    new Arc2D.Float(10.7209F, 2F, 17.4419F, 17.4419F, 35F, 140F, Arc2D.PIE),
    new Arc2D.Float(10.7209F, 2F, 17.4419F, 17.4419F, 215F, 140F, Arc2D.PIE),
    new Arc2D.Float(10.7209F, 2F, 17.4419F, 17.4419F, -5F, 40F, Arc2D.PIE),
    new Arc2D.Float(10.7209F, 2F, 17.4419F, 17.4419F, 175F, 40F, Arc2D.PIE),
    new Arc2D.Float(12.4651F, 3.74419F, 13.9535F, 13.9535F, 0F, 360F, Arc2D.PIE),
    new Arc2D.Float(10.7209F, 2F, 17.4419F, 17.4419F, 0F, 360F, Arc2D.PIE),
    new Rectangle2D.Float(38.901F, 10.7637F, 17.4419F, 13.9535F),
    new Line2D.Float( 19.4419F, 28.1628F, 19.4419F, 19.4419F),
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
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[1]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
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
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[5]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[6]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[7]);
    }
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[4]);
    if ( shadow == 0) {
    ((Arc2D)shapes[8]).setArcType(Arc2D.PIE);
    g.setColor(GeColor.getColor(74, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[8]);
    ((Arc2D)shapes[8]).setArcType(Arc2D.OPEN);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[8]);
    } else {
    ((Arc2D)shapes[9]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes[10]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes[11]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes[12]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes[13]).setArcType(Arc2D.PIE);
    {
    int fcolor = GeColor.getDrawtype(74, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[9]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[10]);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[11]);
    g.fill( shapes[12]);
    g.fill( shapes[13]);
    }
    ((Arc2D)shapes[14]).setArcType(Arc2D.OPEN);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[14]);
    }
    {
    int fcolor = GeColor.getDrawtype(300, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[15]);
    }
    g.setColor(GeColor.getColor( annot1Color , colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont( annot1Font);
    save_tmp = g.getTransform();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
    g.transform( AffineTransform.getScaleInstance( original_width/width *
      		height/original_height, 1));
    if ( annot1 != null)
      g.drawString( annot1, 39 * original_height / height * width / original_width, 24F);
    g.setTransform( save_tmp);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[16]);
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class bcomp_levelsensor extends GeComponent {
  // Dimension size;
  public bcomp_levelsensor( JopSession session)
  {
    super( session);
    size = new Dimension( 21, 21);
  }
  public int original_width = 21;
  public int original_height = 21;
  Shape[] shapes = new Shape[] { 
    new Polygon( new int[] { 11, 2, 19, 11}, new int[] {19, 2, 2, 19}, 4),
    new Polygon( new int[] { 11, 11, 7, 2}, new int[] { 19, 15, 6,2}, 4),
    new Polygon( new int[] { 2, 7, 17, 19}, new int[] { 2, 6, 6,2}, 4),
    new Polygon( new int[] { 19, 17, 11, 11}, new int[] { 2, 6, 15,19}, 4),
    new Line2D.Float( 8.97674F, 10.7209F, 8.97674F, 4.61628F),
    new Line2D.Float( 12.4651F, 10.7209F, 8.97674F, 10.7209F),
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
    g.setColor(GeColor.getColor( annot1Color , colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont( annot1Font);
    save_tmp = g.getTransform();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
    g.transform( AffineTransform.getScaleInstance( original_width/width *
      		height/original_height, 1));
    if ( annot1 != null)
      g.drawString( annot1, 8 * original_height / height * width / original_width, 25F);
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
    new Polygon( new int[] { 2, 3, 3, 2}, new int[] { 19, 22, 35,37}, 4),
    new Polygon( new int[] { 2, 3, 17, 19}, new int[] { 37, 35, 28,28}, 4),
    new Polygon( new int[] { 19, 17, 3, 2}, new int[] { 28, 28, 22,19}, 4),
    new Polygon( new int[] { 37, 37, 19, 37}, new int[] {19, 37, 28, 19}, 4),
    new Polygon( new int[] { 37, 36, 36, 37}, new int[] { 19, 22, 35,37}, 4),
    new Polygon( new int[] { 37, 36, 21, 19}, new int[] { 37, 35, 28,28}, 4),
    new Polygon( new int[] { 19, 21, 36, 37}, new int[] { 28, 28, 22,19}, 4),
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
      g.drawString( annot1, 37 * original_height / height * width / original_width, 18F);
    g.setTransform( save_tmp);
    }
    if ( rounds == 2)
      g.setClip(null);
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
protected class Grp59_ extends GeComponent {
  // Dimension size;
  public Grp59_( JopSession session)
  {
    super( session);
    size = new Dimension( 101, 190);
  }
  public int original_width = 101;
  public int original_height = 190;
  Shape[] shapes = new Shape[] { 
    new RoundRectangle2D.Float(2F, 2F, 97.8751F, 186.628F, 58.7251F, 58.7251F),
    new Rectangle2D.Float(31.3625F, 2F, 39.1501F, 5.87251F),
    new Rectangle2D.Float(2F, 31.3625F, 5.87251F, 127.903F),
    new Arc2D.Float(2F, 2F, 58.7251F, 58.7251F, 90F, 90F, Arc2D.PIE),
    new Arc2D.Float(41.1501F, 2F, 58.7251F, 58.7251F, 45F, 45F, Arc2D.PIE),
    new Arc2D.Float(2F, 129.903F, 58.7251F, 58.7251F, 180F, 45F, Arc2D.PIE),
    new Rectangle2D.Float(31.3625F, 182.755F, 39.1501F, 5.87251F),
    new Rectangle2D.Float(94.0026F, 31.3625F, 5.87251F, 127.903F),
    new Arc2D.Float(41.1501F, 129.903F, 58.7251F, 58.7251F, 270F, 90F, Arc2D.PIE),
    new Arc2D.Float(41.1501F, 2F, 58.7251F, 58.7251F, 0F, 45F, Arc2D.PIE),
    new Arc2D.Float(2F, 129.903F, 58.7251F, 58.7251F, 225F, 45F, Arc2D.PIE),
    new RoundRectangle2D.Float(7.87251F, 7.87251F, 86.1301F, 174.883F, 46.9801F, 46.9801F),
    new RoundRectangle2D.Float(2F, 2F, 97.8751F, 186.628F, 58.7251F, 58.7251F),
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
    int fcolor = GeColor.getDrawtype(223, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[5]);
    g.fill( shapes[4]);
    g.fill( shapes[3]);
    g.fill( shapes[2]);
    g.fill( shapes[1]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[10]);
    g.fill( shapes[9]);
    g.fill( shapes[8]);
    g.fill( shapes[7]);
    g.fill( shapes[6]);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[11]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[12]);
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
