package com.example.bom.healthtracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.DatePicker;
import android.widget.TextView;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class HistoryActivity extends AppCompatActivity {

    private TextView detailHistory;
    private DatePicker inputDate;
    DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        inputDate = (DatePicker) findViewById(R.id.inputDate);
        detailHistory = (TextView) findViewById(R.id.detailHistory);

        StringBuffer asdf = new StringBuffer();
        asdf.append(inputDate.getDayOfMonth());
        asdf.append(inputDate.getMonth());
        asdf.append(inputDate.getYear());
        final String finalDateValue = asdf.toString();



       // detailHistory.setText(finalDateValue, TextView.BufferType.EDITABLE);
        detailHistory.setText("4PM Heachache - Lack of sleep due to Hoya Hacks");


         inputDate.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
                                                @Override
                                                public void onDateChanged(DatePicker datePicker, int i1, int i2, int i3) {

                                                    if (i3 == 1) {
                                                        detailHistory.setText("Your health was perfectly fine on this day");
                                                    } else if (i3 == 2) {
                                                        detailHistory.setText("3am - woke up from sleep and could not go back to sleep");
                                                    } else if (i3==3) {
                                                        detailHistory.setText("severe headache with muscle pain");
                                                    } else if (i3==4) {
                                                        detailHistory.setText("fever of 103F");
                                                    } else if (i3==15) {
                                                        detailHistory.setText("allergy");
                                                    }

                                                    //
                                                }
                                            });
    }
}

            /**
        @Override
        public void onCancelled(DatabaseError databaseError) {
        // Getting Post failed, log a message
        Log.w("error", "loadPost:onCancelled", databaseError.toException());
        // ...
        }
        };
        }
        });

         }

    @Override
    protected void onStart() {
        super.onStart();

        inputDate = (DatePicker) findViewById(R.id.inputDate);
        detailHistory = (TextView) findViewById(R.id.detailHistory);

        StringBuffer changedDate = new StringBuffer();
        changedDate.append(inputDate.getDayOfMonth());
        changedDate.append(inputDate.getMonth());
        changedDate.append(inputDate.getYear());
        final String finalDateValue = changedDate.toString();

        DatabaseReference dateRef = mRootRef.child(finalDateValue);
        dateRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                detailHistory.setText(finalDateValue);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                // Getting Post failed, log a message
                Log.w("error", "loadPost:onCancelled", databaseError.toException());
                // ...
            }
        });
    }*/

