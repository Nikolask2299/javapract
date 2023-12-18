package mainpackage;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class SkripJFrame extends javax.swing.JFrame {
         
    private Build_Data Data = new Build_Data();

    private ImageIcon ImageCreate(String file) {
            if (file == "empty") {
               return new ImageIcon("src/main/java/Icon/def_icon.jpg");
            }
            ImageIcon image = new ImageIcon(file);
           return image;
    }


    private boolean Checked(String [] mass) {
        boolean Check = false;
            if (!mass[0].isEmpty()) {
                Check  = true;
            }
            if (!mass[1].isEmpty()) {
                Check  = true;
            }
            if (!mass[2].isEmpty()) {
                Check  = true;
            }
            if (!mass[3].isEmpty()) {
                Check  = true;
            }
            if (!mass[4].isEmpty()) {
                Check  = true;
            }
            if (!mass[5].isEmpty()) {
                Check  = true;
            }
            if (!mass[6].isEmpty()) {
                Check  = true;
            }
            if (!mass[7].isEmpty()) {
                Check  = true;
            }
            if (!mass[8].isEmpty()) {
                Check  = true;
            }
            if (!mass[9].isEmpty()) {
                Check  = true;
            }
            if (!mass[10].isEmpty()) {
                Check  = true;
            }
            return Check;
    }

    private String[] GetRedactInfor(){
        String Id = jTextField_ID.getText();
        String Name = jTextField_Name.getText();
        String Surname = jTextField_Surname.getText();
        String Paronyc = jTextField_Paronyc.getText();
        String Telephone = jTextField_Phone.getText();
        String AgeUser = jTextField_Age.getText();
        String ModelAuto = jTextField_Auto.getText();
        String AutoNumber = jTextField_AutoNum.getText();
        String AdressUser = jTextField_Adress.getText();
        String Benefits = "";
         if (jRadioButton_Benefic.isSelected()) {
            Benefits = "true";
         }
        String BenefCateg = jTextField_BenefCat.getText();

        return new String[] {Id, Name, Surname, Paronyc, Telephone, AgeUser, ModelAuto, AutoNumber, AdressUser, Benefits, BenefCateg};
    }

    private void SetRedactInfor(Users user){
        jTextField_ID.setText("" + user.getIDUser());
        jTextField_Name.setText(user.getName());
        jTextField_Surname.setText(user.getSurname());
        jTextField_Paronyc.setText(user.getParonyc());
        jTextField_Phone.setText(user.getTelephone());
        jTextField_Age.setText("" + user.getAgeUser());
        jTextField_Auto.setText(user.getModelAuto());
        jTextField_AutoNum.setText(user.getAutoNumber());
        jTextField_Adress.setText(user.getAdressUser());
        jTextField_BenefCat.setText(user.getBenefCateg());

        jLabel_Icon_Car.setIcon(ImageCreate(user.GetFieled()));
    }

    private Users GetInfor() {
        
        String Name = jTextField_Name.getText();
        String Surname = jTextField_Surname.getText();
        String Paronyc = jTextField_Paronyc.getText();
        String Telephone = jTextField_Phone.getText();
        int AgeUser = Integer.parseInt(jTextField_Age.getText());
        String ModelAuto = jTextField_Auto.getText();
        String AutoNumber = jTextField_AutoNum.getText();
        String AdressUser = jTextField_Adress.getText();
        boolean Benefits;
        if (jRadioButton_Benefic.isSelected()) {
            Benefits = true;
        } else {
            Benefits = false;
        }
        int IDUser;
        String BenefCateg = jTextField_BenefCat.getText();
        if (jTextField_ID.getText().isEmpty()) {
            String strok = Name + Surname + Paronyc;
            IDUser = CreateIdUser(strok);
        } else {
            IDUser = Integer.parseInt(jTextField_ID.getText());
        }
        Users user = new Users(); 
        user.NewUsers(IDUser, Name, Surname, Paronyc, Telephone, AgeUser, ModelAuto, AutoNumber, AdressUser, Benefits, BenefCateg, "");
        return user;
    }

    private int CreateIdUser(String fio){
        int Id = 0;
        byte[] utf16 = fio.getBytes(StandardCharsets.UTF_16);
        for (byte bt : utf16) {
            Id += bt;
        }
        Id %= 1000;
        return Id;
    }

    /**
     * Creates new form SkripJFrame
     */
    public SkripJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton_Delete = new javax.swing.JButton();
        jButton_Redactor = new javax.swing.JButton();
        jButton_Add = new javax.swing.JButton();
        jButton_Cleaner = new javax.swing.JButton();
        jButton_Upload_File = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Paronyc = new javax.swing.JTextField();
        jTextField_Surname = new javax.swing.JTextField();
        jTextField_Name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_Phone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Auto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_AutoNum = new javax.swing.JTextField();
        jRadioButton_Benefic = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField_Adress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_BenefCat = new javax.swing.JTextField();
        jTextField_Result_Search = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField_Age = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel_File_Stat = new javax.swing.JLabel();
        jButton_Search = new javax.swing.JButton();
        jButton_Load_File = new javax.swing.JButton();
        jButton_UP_User = new javax.swing.JButton();
        jButton_Down_User = new javax.swing.JButton();
        jLabel_Out_Index = new javax.swing.JLabel();
        jLabel_Icon_Car = new javax.swing.JLabel();

        jLabel14.setText("jLabel14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_Delete.setText("Удалить");
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });

        jButton_Redactor.setText("Редактировать");
        jButton_Redactor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RedactorActionPerformed(evt);
            }
        });

        jButton_Add.setText("Добавить");
        jButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddActionPerformed(evt);
            }
        });

        jButton_Cleaner.setText("Очистить все");
        jButton_Cleaner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CleanerActionPerformed(evt);
            }
        });

        jButton_Upload_File.setText("Выгрузить файл");
        jButton_Upload_File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Upload_FileActionPerformed(evt);
            }
        });

        jLabel2.setText("Имя");

        jLabel3.setText("Фамилия");

        jLabel4.setText("Отчество");

        jLabel5.setText("Телефон");

        jLabel6.setText("Автомобиль");

        jLabel7.setText("Гос. номер");

        jRadioButton_Benefic.setText("Наличие льгот");

        jLabel8.setText("Адрес проживания");

        jLabel9.setText("Категория льготы");

        jLabel10.setText("Найдено");

        jLabel11.setText("ID пользователя");

        jLabel12.setText("Возраст");

        jLabel_File_Stat.setText("Файл не загружен");

        jButton_Search.setText("Найти");
        jButton_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SearchActionPerformed(evt);
            }
        });

        jButton_Load_File.setText("Загрузить файл");
        jButton_Load_File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton_Load_FileActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        jButton_UP_User.setText("Вперед");
        jButton_UP_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UP_UserActionPerformed(evt);
            }
        });

        jButton_Down_User.setText("Назад");
        jButton_Down_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Down_UserActionPerformed(evt);
            }
        });

        jLabel_Out_Index.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_Adress))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_Redactor)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Cleaner, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField_Result_Search)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton_Benefic)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_BenefCat, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jButton_Down_User, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_Out_Index, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_UP_User, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField_Phone, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTextField_Name)
                                                    .addComponent(jTextField_Surname)
                                                    .addComponent(jTextField_Paronyc, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(71, 71, 71)
                                        .addComponent(jLabel_Icon_Car, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton_Upload_File, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Load_File, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Auto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_AutoNum, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_File_Stat)
                        .addGap(43, 43, 43)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextField_Surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextField_Paronyc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(jTextField_Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField_Auto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField_AutoNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_File_Stat)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jButton_Upload_File, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jButton_Load_File, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_Icon_Car, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_Adress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_Benefic)
                    .addComponent(jLabel9)
                    .addComponent(jTextField_BenefCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Result_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Out_Index, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_UP_User)
                    .addComponent(jButton_Down_User))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Redactor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Cleaner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed
            Users us = GetInfor();
            Data.PutData(us);
            jTextField_Result_Search.setText("Ваш новый ID: " + us.getIDUser());
    }//GEN-LAST:event_jButton_AddActionPerformed

    private void jButton_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchActionPerformed
                String[] mass = GetRedactInfor();
                int ind = Data.Search(mass);
                Data.SetPrimIndex(ind);
                jLabel_Out_Index.setText(String.valueOf(Data.GetPrimIndex()));
                String Result = Data.SearString(ind);
                jTextField_Result_Search.setText(Result);
                if (ind != -1) {
                    SetRedactInfor(Data.GetData(Data.GetPrimIndex()));
                }    
    }//GEN-LAST:event_jButton_SearchActionPerformed

    private void jButton_Upload_FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Upload_FileActionPerformed
        try {
            Build_File.FileOpenWrite(Data);
            jLabel_File_Stat.setText("Файл успешно выгружен");
            Data.SetPrimIndex(-1);
            jLabel_Out_Index.setText("null");
            jTextField_Result_Search.setText("");
        } catch (IOException ex) {
            Logger.getLogger(SkripJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_Upload_FileActionPerformed

    private void jButton_CleanerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CleanerActionPerformed
                jTextField_ID.setText("");
                jTextField_Name.setText("");
                jTextField_Surname.setText("");
                jTextField_Paronyc.setText("");
                jTextField_Phone.setText("");
                jTextField_Age.setText("");
                jTextField_Auto.setText("");
                jTextField_AutoNum.setText("");
                jTextField_Adress.setText("");
                jTextField_BenefCat.setText("");
                jTextField_Result_Search.setText("");
    }//GEN-LAST:event_jButton_CleanerActionPerformed

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
                int ind = -1;
                String[] mass = GetRedactInfor();
                if (Checked(mass)) {
                    ind = Data.GetPrimIndex();
                } else {
                    ind = Data.Search(mass);
                }
                if (ind == -1) {
                   jTextField_Result_Search.setText(Data.SearString(ind));
                } else {
                    Data.SetPrimIndex(ind);
                    jLabel_Out_Index.setText(String.valueOf(Data.GetPrimIndex()));
                    jTextField_Result_Search.setText(Data.SearString(ind));
                    Data.SetPrimIndex(ind - 1);
                    jLabel_Out_Index.setText(String.valueOf(Data.GetPrimIndex()));
                    jTextField_Result_Search.setText(Data.SearString(Data.GetPrimIndex()));
                    SetRedactInfor(Data.GetData(Data.GetPrimIndex()));
                    Data.RemoveData(ind);
                }
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    private void jButton_RedactorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RedactorActionPerformed
            String[] masse = GetRedactInfor();
            String[] mass = Arrays.copyOfRange(masse, 1, masse.length - 1);
            if (!mass[0].isEmpty()) {
                Data.RedactorUser(1, mass[0]);
            }
            if (!mass[1].isEmpty()) {
                Data.RedactorUser(2, mass[1]);
            }
            if (!mass[2].isEmpty()) {
                Data.RedactorUser(3, mass[2]);
            }
            if (!mass[3].isEmpty()) {
                Data.RedactorUser(4, mass[3]);
            }
            if (!mass[4].isEmpty()) {
                Data.RedactorUser(5, mass[4]);
            }
            if (!mass[5].isEmpty()) {
                Data.RedactorUser(6, mass[5]);
            }
            if (!mass[6].isEmpty()) {
                Data.RedactorUser(7, mass[6]);
            }
            if (!mass[7].isEmpty()) {
                Data.RedactorUser(8, mass[7]);
            }
            if (!mass[8].isEmpty()) {
                Data.RedactorUser(9, mass[8]);
            }
            if (!mass[9].isEmpty()) {
                Data.RedactorUser(10, mass[9]);
            }
            jTextField_Result_Search.setText(Data.SearString(Data.GetPrimIndex()));
            SetRedactInfor(Data.GetData(Data.GetPrimIndex()));

    }//GEN-LAST:event_jButton_RedactorActionPerformed

    private void jButton_Load_FileActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_jButton_Load_FileActionPerformed
        Build_File.FileOpenRead(Data);
        jLabel_File_Stat.setText("Файл успешно загружен");
        Data.SetPrimIndex(-1);
        jLabel_Out_Index.setText("null");
        jTextField_Result_Search.setText("");
        
    }//GEN-LAST:event_jButton_Load_FileActionPerformed

    private void jButton_Down_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Down_UserActionPerformed
        jTextField_Result_Search.setText("");
        Data.DownPrimIndex();
        jLabel_Out_Index.setText(String.valueOf(Data.GetPrimIndex()));
        jTextField_Result_Search.setText(Data.SearString(Data.GetPrimIndex()));
        SetRedactInfor(Data.GetData(Data.GetPrimIndex()));
    }//GEN-LAST:event_jButton_Down_UserActionPerformed

    private void jButton_UP_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UP_UserActionPerformed
        jTextField_Result_Search.setText("");
        Data.UpPrimIndex();
        jLabel_Out_Index.setText(String.valueOf(Data.GetPrimIndex()));
        jTextField_Result_Search.setText(Data.SearString(Data.GetPrimIndex()));
        SetRedactInfor(Data.GetData(Data.GetPrimIndex()));
    }//GEN-LAST:event_jButton_UP_UserActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */



        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SkripJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SkripJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SkripJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SkripJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SkripJFrame().setVisible(true);
            }
        });
    } 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Cleaner;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Down_User;
    private javax.swing.JButton jButton_Load_File;
    private javax.swing.JButton jButton_Redactor;
    private javax.swing.JButton jButton_Search;
    private javax.swing.JButton jButton_UP_User;
    private javax.swing.JButton jButton_Upload_File;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_File_Stat;
    private javax.swing.JLabel jLabel_Icon_Car;
    private javax.swing.JLabel jLabel_Out_Index;
    private javax.swing.JRadioButton jRadioButton_Benefic;
    private javax.swing.JTextField jTextField_Adress;
    private javax.swing.JTextField jTextField_Age;
    private javax.swing.JTextField jTextField_Auto;
    private javax.swing.JTextField jTextField_AutoNum;
    private javax.swing.JTextField jTextField_BenefCat;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JTextField jTextField_Paronyc;
    private javax.swing.JTextField jTextField_Phone;
    private javax.swing.JTextField jTextField_Result_Search;
    private javax.swing.JTextField jTextField_Surname;
    // End of variables declaration//GEN-END:variables
}
