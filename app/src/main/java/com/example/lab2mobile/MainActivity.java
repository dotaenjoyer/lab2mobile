package com.example.lab2mobile;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.lab2mobile.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private static List<String> students;
    private ArrayAdapter<String> adapter;

    static {
        students = new ArrayList<>();
        students.add("Василенко Олександр Андрійович");
        students.add("Громов Максим Євгенович");
        students.add("Кайдашова Юлія Олександрівна");
        students.add("Киндюк Владислав Андрійович");
        students.add("Кормаков Ігор Олегович");
        students.add("Кутасов Олександр Русланович");
        students.add("Лисогор Максим Віталійович");
        students.add("Мочуляк Ярослав Сергійович");
        students.add("Ольвінська Аліна Денисівна");
        students.add("Поштаренко Руслан Сергійович");
        students.add("Рибалка Анна Юріївна");
        students.add("Румянцев Олексій Євгенійович");
        students.add("Скрипник Владислав Олегович");
        students.add("Тропанець Євгеній Іванович");
        students.add("Тутов Дмитро Олександрович");
        students.add("Шендеровський Вячеслав Валерійович");
        students.add("Шихаде Михайло Асимович");
        students.add("До В`єт Мінь Хоанг");
        students.add("Золотарьов Олександр Вадимович");
        students.add("Кліпковський Владислав Олександрович");
        students.add("Логунов Дмитро Максимович");
        students.add("Соколов Дмитро Олегович");
        students.add("Уманець Дамір Юрійович");
        students.add("Щербаков Владислав Валентинович");
        students.add("Ярошенко Костянтин Сергійович");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);
        ListView listView = (ListView) binding.listview;
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, students);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view,
                                    final int position, long id) {
                students.remove(position);
                adapter.notifyDataSetChanged();
            }
        });
    }

}