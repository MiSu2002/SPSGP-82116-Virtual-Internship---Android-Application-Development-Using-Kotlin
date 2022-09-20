package com.sbappdeveloper.grocery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0015J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000eH\u0017J\b\u0010\u0015\u001a\u00020\u0010H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/sbappdeveloper/grocery/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/sbappdeveloper/grocery/GroceryRVAdapter$GroceryItemClickInterface;", "()V", "addFAB", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "groceryRVAdapter", "Lcom/sbappdeveloper/grocery/GroceryRVAdapter;", "groceryViewModal", "Lcom/sbappdeveloper/grocery/GroceryViewModal;", "itemsRV", "Landroidx/recyclerview/widget/RecyclerView;", "list", "", "Lcom/sbappdeveloper/grocery/GroceryItems;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "groceryItems", "openDialog", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.sbappdeveloper.grocery.GroceryRVAdapter.GroceryItemClickInterface {
    private androidx.recyclerview.widget.RecyclerView itemsRV;
    private com.google.android.material.floatingactionbutton.FloatingActionButton addFAB;
    private java.util.List<com.sbappdeveloper.grocery.GroceryItems> list;
    private com.sbappdeveloper.grocery.GroceryRVAdapter groceryRVAdapter;
    private com.sbappdeveloper.grocery.GroceryViewModal groceryViewModal;
    
    public MainActivity() {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void openDialog() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.sbappdeveloper.grocery.GroceryItems groceryItems) {
    }
}