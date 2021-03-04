/*

GitHandler - A GitHub release handler

Copyright (C) 2021 Dylan Wedman

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License along
with this program; if not, write to the Free Software Foundation, Inc.,
51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.

 */
package ui;

import git.Asset;
import git.GitHandler;
import git.Release;
import java.awt.EventQueue;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * This is a standalone application that shows an example on how to use the
 * library.
 *
 * @author Dylan Wedman
 */
public class StandaloneUI extends JFrame {

    public StandaloneUI() {
        initComponents();
        Assets.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    ArrayList<Release> releases;
    DefaultListModel assetList = new DefaultListModel();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RepoField = new javax.swing.JFormattedTextField();
        RepoFieldLabel = new javax.swing.JLabel();
        Git = new javax.swing.JButton();
        TagsLabel = new javax.swing.JLabel();
        Tags = new javax.swing.JComboBox<>();
        StatusLabel = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
        ScrollPane = new javax.swing.JScrollPane();
        Assets = new javax.swing.JList<>();
        Download = new javax.swing.JButton();
        ReleaseNameLabel = new javax.swing.JLabel();
        ReleaseName = new javax.swing.JLabel();
        GetLatestReleaseOnly = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GitHandler");
        setAlwaysOnTop(true);
        setResizable(false);

        RepoField.setText("https://github.com/CTCaer/hekate/releases");

        RepoFieldLabel.setText("Repository URL:");

        Git.setText("Git");
        Git.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GitActionPerformed(evt);
            }
        });

        TagsLabel.setText("Tag:");

        Tags.setEnabled(false);
        Tags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TagsActionPerformed(evt);
            }
        });

        StatusLabel.setText("Status:");

        Status.setText("Waiting");

        Assets.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                AssetsValueChanged(evt);
            }
        });
        ScrollPane.setViewportView(Assets);

        Download.setText("Download");
        Download.setEnabled(false);
        Download.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DownloadActionPerformed(evt);
            }
        });

        ReleaseNameLabel.setText("Release:");

        GetLatestReleaseOnly.setText("Get latest release only");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(RepoFieldLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TagsLabel)
                            .addComponent(Tags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ReleaseNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ReleaseName, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(StatusLabel)
                                .addGap(5, 5, 5)
                                .addComponent(Status))
                            .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(Download, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(RepoField, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Git))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(GetLatestReleaseOnly)))
                .addGap(444, 444, 444))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(RepoFieldLabel)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RepoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Git, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(GetLatestReleaseOnly)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TagsLabel)
                .addGap(6, 6, 6)
                .addComponent(Tags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ReleaseNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StatusLabel)
                            .addComponent(Status))
                        .addGap(6, 6, 6)
                        .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Download))
                    .addComponent(ReleaseName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(516, 355));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GitActionPerformed
        new Thread() {
            @Override
            public void run() {
                Tags.removeAllItems();
                Tags.setEnabled(false);
                assetList.clear();
                ReleaseName.setText("");
                Status.setText("Fetching assets");
                releases = GitHandler.generateReleases(RepoField.getText());

                boolean latest = true;
                for (Release release : releases) {
                    if (latest) {
                        Tags.addItem(release.getTag());
                        latest = false;
                        
                        if (GetLatestReleaseOnly.isSelected()) {
                            break;
                        }
                    } else {
                        Tags.addItem(release.getTag());
                    }
                }

                Tags.setEnabled(true);
                Status.setText("Waiting");
            }
        }.start();
    }//GEN-LAST:event_GitActionPerformed

    private void TagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TagsActionPerformed
        for (Release release : releases) {
            if (release.getTag().equals(Tags.getSelectedItem())) {
                assetList.clear();
                ReleaseName.setText(release.getReleaseName());

                for (Asset asset : release.getAssets()) {
                    assetList.addElement(asset.getAssetName());
                }

                Assets.setModel(assetList);
            }
        }
    }//GEN-LAST:event_TagsActionPerformed

    private void DownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DownloadActionPerformed
        if (Assets.getSelectedIndex() != -1) {
            FileNameExtensionFilter zip = new FileNameExtensionFilter("Zip Archive", "zip");
            FileNameExtensionFilter tar = new FileNameExtensionFilter("tar.gz Archive", "tar.gz");

            JFileChooser chooser = new JFileChooser();
            chooser.setDialogTitle("Save asset as");
            chooser.setAcceptAllFileFilterUsed(true);

            if (Assets.getSelectedValue().contains("(zip)")) {
                chooser.setAcceptAllFileFilterUsed(false);
                chooser.addChoosableFileFilter(zip);
                chooser.setSelectedFile(new File(ReleaseName.getText().replaceAll(" ", "-") + ".zip"));
            } else if (Assets.getSelectedValue().contains("(tar.gz)")) {
                chooser.setAcceptAllFileFilterUsed(false);
                chooser.addChoosableFileFilter(tar);
                chooser.setSelectedFile(new File(ReleaseName.getText().replaceAll(" ", "-") + ".tar.gz"));
            } else {
                chooser.setSelectedFile(new File(Assets.getSelectedValue()));
            }

            int returnValue = chooser.showSaveDialog(this);

            if (returnValue == JFileChooser.APPROVE_OPTION) {
                for (Release release : releases) {
                    if (release.getReleaseName().equals(ReleaseName.getText())) {
                        for (Asset asset : release.getAssets()) {
                            if (asset.getAssetName().equals(Assets.getSelectedValue())) {
                                Status.setText("Downloading " + asset.getAssetName());

                                new Thread() {
                                    @Override
                                    public void run() {
                                        GitHandler.downloadAsset(asset, chooser.getSelectedFile().getAbsolutePath());
                                    }
                                }.start();

                                Status.setText("Waiting");
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_DownloadActionPerformed

    private void AssetsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_AssetsValueChanged
        if (Assets.getSelectedIndex() != -1) {
            Download.setEnabled(true);
        } else {
            Download.setEnabled(false);
        }
    }//GEN-LAST:event_AssetsValueChanged

    /**
     * The main void to launch the standalone application
     *
     * @param args The arguments; can be null as there is no use for them
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(StandaloneUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(() -> {
            new StandaloneUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Assets;
    private javax.swing.JButton Download;
    private javax.swing.JCheckBox GetLatestReleaseOnly;
    private javax.swing.JButton Git;
    private javax.swing.JLabel ReleaseName;
    private javax.swing.JLabel ReleaseNameLabel;
    private javax.swing.JFormattedTextField RepoField;
    private javax.swing.JLabel RepoFieldLabel;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JLabel Status;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JComboBox<String> Tags;
    private javax.swing.JLabel TagsLabel;
    // End of variables declaration//GEN-END:variables
}
