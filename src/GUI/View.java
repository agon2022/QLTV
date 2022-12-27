package GUI;

import Book.sach;
import Read.Main;
import Read.docghi;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public final class View extends javax.swing.JFrame {

    DefaultTableModel model;
    private ArrayList<Main> listsach;
    docghi ioFile;

    public View() {
        ioFile = new docghi();
        listsach = new ArrayList<>();
        listsach = ioFile.doc("sach.txt");
        initComponents();
        model = (DefaultTableModel) banghienthisach.getModel();
        hienthisach();
    }

    public void hienthisach() {
        for (Main g : listsach) {
            sach s = (sach) g;
            model.addRow(new Object[]{
                    s.getMasach(), s.getTensach(), s.getTheloai(), s.getTacgia(), s.getSoluong(), s.getTinhtrang()
            });
        }
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        banghienthisach = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        nhaptensach = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        nhaptheloaisach = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        nhaptacgia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        nhapsoluongsach = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tinhtrangsach = new javax.swing.JComboBox<>();
        themsach = new javax.swing.JButton();
        nutsuasach = new javax.swing.JButton();
        luusach = new javax.swing.JButton();
        nuthuy1 = new javax.swing.JButton();
        nutxoa = new javax.swing.JButton();
        nutThoat1 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        nhaptukhoasach = new javax.swing.JTextField();
        nuttimsach = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel28 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLabel17 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Assignment_Book");


        banghienthisach.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Mã sách", "Tên sách", "Thể loại", "Tác giả", "Số lượng", "Tình trạng"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(banghienthisach);

        jLabel6.setText("Tên sách");

        nhaptensach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhaptensachActionPerformed(evt);
            }
        });

        jLabel7.setText("Thể loại");

        nhaptheloaisach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhaptheloaisachActionPerformed(evt);
            }
        });

        jLabel8.setText("Tác giả");

        jLabel9.setText("Số lượng");

        jLabel10.setText("Tình trạng");

        tinhtrangsach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Còn", "Hết" }));
        tinhtrangsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinhtrangsachActionPerformed(evt);
            }
        });

        themsach.setText("Thêm");
        themsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themsachActionPerformed(evt);
            }
        });

        nutsuasach.setText("Sửa");
        nutsuasach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutsuasachActionPerformed(evt);
            }
        });

        luusach.setText("Lưu");
        luusach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luusachActionPerformed(evt);
            }
        });

        nuthuy1.setText("Hủy");
        nuthuy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuthuy1ActionPerformed(evt);
            }
        });

        nutxoa.setText("Xóa");
        nutxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutxoaActionPerformed(evt);
            }
        });

        nutThoat1.setText("Thoát chương trình");
        nutThoat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutThoat1ActionPerformed(evt);
            }
        });


        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel24.setText("Tìm Kiếm");

        jLabel25.setText("Từ Khóa");

        nuttimsach.setText("Tìm");
        nuttimsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuttimsachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(jLabel7))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(nhaptensach, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                                                        .addComponent(nhaptheloaisach)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(jLabel9)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                                .addGap(1, 1, 1)
                                                                                .addComponent(jLabel8)))
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                                .addComponent(tinhtrangsach, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(49, 49, 49))
                                                                                        .addComponent(nhapsoluongsach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(20, 20, 20)
                                                                                .addComponent(nhaptacgia, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(120, 120, 120)
                                                                .addComponent(jLabel25)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(nhaptukhoasach, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 25, Short.MAX_VALUE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel24)
                                                                                .addGap(103, 103, 103))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(nuttimsach)
                                                                                .addGap(122, 122, 122)))))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(nutThoat1)
                                                                .addContainerGap())
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(nutxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(nutsuasach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(themsach, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(luusach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(33, 33, 33))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(342, 342, 342)
                                                .addComponent(nuthuy1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(145, 145, 145))))
                        .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(26, 26, 26)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(nhaptensach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel24)))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel25)
                                                                        .addComponent(nhaptukhoasach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(16, 16, 16)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(nhaptheloaisach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel7)))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(themsach)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(nhaptacgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel8))
                                                                .addGap(21, 21, 21)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(nhapsoluongsach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel9))
                                                                .addGap(18, 18, 18))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(nutsuasach)
                                                                        .addComponent(nuttimsach))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(luusach)
                                                                .addGap(44, 44, 44)))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel10)
                                                        .addComponent(tinhtrangsach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nutxoa))
                                                .addGap(0, 42, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(nuthuy1)
                                                .addGap(41, 41, 41)
                                                .addComponent(nutThoat1)
                                                .addContainerGap())))
        );

        jTabbedPane1.addTab("Quản lý sách", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTabbedPane1)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    private void nhaptheloaisachActionPerformed(java.awt.event.ActionEvent evt) {
    }
    public boolean khongtrungmasach(int masach) {
        for (Main g : listsach) {
            sach s = (sach) g;
            if (s.getMasach() == masach) {
                return false;
            }
        }
        return true;
    }
    private void themsachActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int ma = 100;
            while (true) {
                if (khongtrungmasach(ma)) {
                    break;
                }
                ma++;
            }
            sach s = new sach();
            s.setMasach(ma);
            s.setTensach(nhaptensach.getText());
            s.setTheloai(nhaptheloaisach.getText());
            s.setTacgia(nhaptacgia.getText());
            if (nhapsoluongsach.getText().length() == 0) {
                s.setSoluong(0);
            } else {
                s.setSoluong(Integer.parseInt(nhapsoluongsach.getText()));//(1)
            }

            s.setTinhtrang(tinhtrangsach.getSelectedItem().toString());
            listsach.add(s);
            ioFile.ghi(listsach, "sach.txt");

            model.addRow(new Object[]{
                    s.getMasach(), s.getTensach(), s.getTheloai(), s.getTacgia(), s.getSoluong(), s.getTinhtrang()});
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, "Bạn cần nhạp tên sách!");
        }
    }
    private void nhaptensachActionPerformed(java.awt.event.ActionEvent evt) {

    }
    private void nutThoat1ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void tinhtrangsachActionPerformed(java.awt.event.ActionEvent evt) {

    }
    private void nutsuasachActionPerformed(java.awt.event.ActionEvent evt) {

        int hangchon;
        hangchon = banghienthisach.getSelectedRow();
        if (hangchon != -1) {
            nhaptensach.setText(model.getValueAt(hangchon, 1).toString());
            nhaptheloaisach.setText(model.getValueAt(hangchon, 2).toString());
            nhaptacgia.setText(model.getValueAt(hangchon, 3).toString());
            nhapsoluongsach.setText(model.getValueAt(hangchon, 4).toString());
            tinhtrangsach.setSelectedItem(model.getValueAt(hangchon, 5).toString());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn dòng muốn sửa!");

        }
    }

    private void luusachActionPerformed(java.awt.event.ActionEvent evt) {
        if (nhaptensach.getText().length() != 0) {
            int hang = banghienthisach.getSelectedRow();
            sach s = new sach();
            s.setMasach(Integer.parseInt(model.getValueAt(hang, 0).toString()));//(2)
            s.setTensach(nhaptensach.getText());
            s.setTheloai(nhaptheloaisach.getText());
            s.setTacgia(nhaptacgia.getText());
            if (nhapsoluongsach.getText().length() == 0) {
                s.setSoluong(0);
            } else {
                s.setSoluong(Integer.parseInt(nhapsoluongsach.getText()));
            }

            s.setTinhtrang(tinhtrangsach.getSelectedItem().toString());
            listsach.set(hang, s);
            ioFile.ghi(listsach, "sach.txt");

            model.setValueAt(s.getMasach(), hang, 0);
            model.setValueAt(s.getTensach(), hang, 1);
            model.setValueAt(s.getTheloai(), hang, 2);
            model.setValueAt(s.getTacgia(), hang, 3);
            model.setValueAt(s.getSoluong(), hang, 4);
            model.setValueAt(s.getTinhtrang(), hang, 5);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần nhập Tên sách!");
        }
    }

    private void nutxoaActionPerformed(java.awt.event.ActionEvent evt) {
        int hang = banghienthisach.getSelectedRow();
        if (hang != -1) {
            model.removeRow(hang);
            listsach.remove(hang);
            ioFile.ghi(listsach, "sach.txt");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn dòng muốn xóa!");
        }
    }

    private void nuthuy1ActionPerformed(java.awt.event.ActionEvent evt) {
        nhaptensach.setText("");
        nhaptukhoasach.setText("");
        nhaptheloaisach.setText("");
        nhaptacgia.setText("");
        nhapsoluongsach.setText("");
        tinhtrangsach.setSelectedIndex(0);
    }
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void nuttimsachActionPerformed(java.awt.event.ActionEvent evt) {
            model.fireTableDataChanged();
            TableRowSorter sorter = new TableRowSorter(model);
            banghienthisach.setRowSorter(sorter);
            sorter.setRowFilter(RowFilter.regexFilter(nhaptukhoasach.getText()));


    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    private javax.swing.JTable banghienthisach;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton luusach;
    private javax.swing.JTextField nhapsoluongsach;
    private javax.swing.JTextField nhaptacgia;
    private javax.swing.JTextField nhaptensach;
    private javax.swing.JTextField nhaptheloaisach;
    private javax.swing.JTextField nhaptukhoasach;
    private javax.swing.JButton nutThoat1;
    private javax.swing.JButton nuthuy1;
    private javax.swing.JButton nutsuasach;
    private javax.swing.JButton nuttimsach;
    private javax.swing.JButton nutxoa;
    private javax.swing.JButton themsach;
    private javax.swing.JComboBox<String> tinhtrangsach;


}
